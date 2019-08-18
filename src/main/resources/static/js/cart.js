/*购物车js
* 1、功能购物车界面的商品增删，
* 2、完成界面的小计，总额显示
* */

$(function () {
    var cartData;
    var cartLen;

    $.ajax({
        url:"http://localhost:8080/selectcardgoods",
        type:"post",
        dataType:"json",
        success:function (info) {
            cartData = info;
            console.log(info);
            cartLen = cartData.length;
            $(".item-form").remove();
            for (var i = 0; i < cartLen; i++) {
                vm.goods.push({id:cartData[i].cartId,name:cartData[i].productG.proName,
                    num:cartData[i].proNum,
                    price:cartData[i].productG.proPrice,
                    check:false,
                    img:cartData[i].productG.productimgs[0].imgUrl,
                    user_id:cartData[i].users.userId,
                });
            }

        }
    });
    var vm = new Vue({
        el:"#item-list",
        data:{
            goods:[{

            }],
        },
        methods:{
            // 点击删除事件
            deleteThis:function (i) {
                var flag = confirm("是否移除该商品出购物车");
                if(flag == true){
                    deletegoods(this.goods[i].id);
                    this.goods.splice(i,1);
                }
            },
            //按钮点击事件商品数量增加与减少
            add:function (i) {
                this.goods[i].num++;
                updategoods(this.goods[i].id,this.goods[i].num);
            },
            sub:function (i){
                if(this.goods[i].num > 1){
                    this.goods[i].num--;
                    updategoods(this.goods[i].id,this.goods[i].num);
                }
                else{
                    var flag = confirm("该商品需要是否移除购物车");
                    if(flag==true){
                        this.goods.splice(i,1);
                    }
                }
            },
            sumcount:function (i) {
                return this.goods[i].price * this.goods[i].num;
            },
            allSumCount:function(){
                var sum = 0 ;

                for (var i = 0 ;i < this.goods.length;i++){
                    if(isNaN(this.sumcount(i))||this.goods[i].check==false){
                        sum+=0;
                    }else{
                        sum +=this.sumcount(i);
                    }
                }
                return sum;
            },

            //清理购物车
            clearCart:function f() {
                var flag=confirm("是否清理购物车");
                if(flag==true){
                    for (var i = 1 ;i < this.goods.length;i++){
                        deletegoods(this.goods[i].id);
                        // this.goods.splice(1,1);
                    }
                    this.goods.splice(0,this.goods.length);
                }
            },
            //jQuery
            all:function () {
                if($("input[name='all']").prop("checked")==true){
                    for(var i = 0;i<this.goods.length;i++){
                        this.goods[i].check = true;
                    }
                    $("#select-all input").prop("checked",true);
                }else{
                    for(var i = 0;i<this.goods.length;i++){
                        this.goods[i].check = false;
                    }
                    $("#select-all input").prop("checked",false);
                }
            },
            allSelect:function () {
                if($("#select-all input").prop("checked")==true){
                    for(var i = 0;i<this.goods.length;i++){
                        this.goods[i].check = true;
                    }
                    $("input[name='all']").prop("checked",true);
                }else{
                    for(var i = 0;i<this.goods.length;i++){
                        this.goods[i].check = false;
                    }
                    $("input[name='all']").prop("checked",false);
                }
            },
            //删除所选商品
            deleteChoose:function () {
                var flag =  confirm("是否移除所选的物品");
                if(flag==true){
                    for (var i = 1; i < this.goods.length;i++){
                        if(this.goods[i].check==true){
                            deletegoods(this.goods[i].id);
                            this.goods.splice(i,1);
                            i--;
                        }
                    }
                }
            },
            chooseGoods:function () {
                var count = 0;
                for (var i = 1 ; i < this.goods.length;i++){
                    if(this.goods[i].check==true){
                        count++;
                    }
                }
                return count;
            },
            gotoOrder:function () {
                var ret;
                var flag = false;
                for (var i = 1 ;i < this.goods.length;i++){
                    if(this.goods[i].check==true)
                    {
                        flag = true;
                    }
                }
                if(flag){
                    insertToOrder(this.goods[1]);
                    selectOrderId(this.goods[1],this.goods);
                }
            }
        }


    });

});
//功能：通过id删除数据库购物车商品
function deletegoods(id) {
    $.ajax({
        url:"http://localhost:8080/deleteCartGoodsById",
        type:"post",
        dataType:"json",
        data:{
            "cartId":JSON.stringify(id)
        },
        success:function (result) {
            if(result > 0){
                alert("success");
            }
            else {
                alert("fail");
            }
        }
    });
}
function updategoods(id,num) {
    $.ajax({
        url:"http://localhost:8080/updateCartById",
        type:"post",
        dataType:"json",
        data:{
            "cartId":JSON.stringify(id),
            "proNum":JSON.stringify(num)
        },
        success:function (result) {
            if(result > 0){
                alert("success");
            }
            else {
                alert("fail");
            }
        }
    });

}

function insertToorderDetail(i,id) {
    $.ajax({
        url:"http://localhost:8080/insertIntoOrderDetail",
        type:"post",
        data:{
            "orderId":id,
            "proId":i.id,
            "proName":i.name,
            "proNum":i.num
        },
        dataType:"json",
        success:function (result) {
            if(result > 0){
                alert("success");
            }
            else {
                alert("fail");
            }
        }
    })
};
function insertToOrder(i) {
    $.ajax({
        url:"http://localhost:8080/insertIntoOrder",
        type:"post",
        data:{
            "userId":i.user_id
        },
        dataType:"json",
        success:function (result) {
            if(result > 0){

                alert("success");
                return true;
            }
            else {
                alert("fail");
                return false;
            }
        }
    })
}
function selectOrderId(i,goods) {
    var ret = 0 ;
    $.ajax({
        url:"http://localhost:8080/selectOrderId",
        type:"post",
        dataType:"json",
        data:{
            "userId":i.user_id,
        },
        success:function (result) {
            ret = result.orderId;
            console.log(result);
            if(typeof(ret)!="undefined"){
                for (var i = 1 ;i < goods.length;i++){
                    if(goods[i].check==true)
                    {
                        insertToorderDetail(goods[i],ret);
                    }
                }


            }
        }

    });

}