//document.write("");

Vue.component('main-component', {
         data () {
             return {
                 yearlist:[],
             }
          },
          mounted:function(){
                  var result = [];
                  this.getDatabyAjax("getYearList",function(res){result = res});
                  this.yearlist = result;
                  console.log(this.yearlist);
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
		template:  '<div class="cd-hero">\
		                <headerlist-component :yearlist="yearlist"></headerlist-component>\
		                <gallery-component :yearlist="yearlist"></gallery-component>\
		            </div>'
});

var app= new Vue({
        el:"#myapp",
        data:{
        },
        filters:{

        },
        computed:{

        },
        mounted:function(){

        },
        created:function(){
            console.log("main-component has created");
        }
});