//document.write("");

Vue.component('main-component', {
		props: ['hearderYearList'],
		template:  '<div class="cd-hero">\
		                <p>我是main-component</p>\
		                <headerlist-component :yearList="hearderYearList"></headerlist-component>\
		            </div>'
});

var app= new Vue({
        el:"#myapp",
        data:{
            hearderYearList: []
        },
        filters:{

        },
        computed:{

        },
        mounted:function(){

        },
        methods:{
            getDatabyAjax(urlStr,calback){
            console.log("getDatabyAjax start");
                $.ajax({
                    //请求方式
                    type : "get",
                    //请求的媒体类型
                    contentType: "application/json;charset=UTF-8",
                    //请求地址
                    url : urlStr,
                    async : false,
                    //数据，json字符串
                    data : JSON,
                    //请求成功
                    success : function(result) {
                    console.log("success");
                        calback(result);
                    },
                    //请求失败，包含具体的错误信息
                    error : function(e){
                        console.log(e.status);
                        console.log(e.responseText);
                    }
                });
                console.log("getDatabyAjax end");
            }
        },
        created:function(){
            console.log("main-component has created");
            var result = [];
            this.getDatabyAjax("getPhotoList",function(res){result = res});
            this.hearderYearList = result;
            console.log("aaa");
            console.log(this.hearderYearList);

        }
});