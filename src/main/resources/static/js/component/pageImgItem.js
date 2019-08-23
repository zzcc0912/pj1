Vue.component('pageimgitem-component', {
            props: ['year'],
            data () {
                return {
                    yearLocal: this.year,
                    pageimgitemlist:[],
                }
            },
            methods: {

            },
            created:function(){
                      console.log("pageimgitem-component created");

                  },
            mounted:function(){
                     var result = [];
                     this.$parent.$parent.getDatabyAjax("getPhotoList?year=" + this.yearLocal,function(res){result = res});
                     this.pageimgitemlist = result;
                     console.log(this.pageimgitemlist);

                     /* Gallery One pop up
                    -----------------------------------------*/

                    console.log("pageimgitem-component created off");
                    },
            template: '<div>\
                            <div class="grid-item zzcc" v-for="(imgitem, index) in pageimgitemlist">\
                               <figure class="effect-bubba">\
                                   <img :src="imgitem.path" alt="Image" class="img-fluid tm-img">\
                                   <figcaption>\
                                       <h2 class="tm-figure-title">Image <span>{{imgitem.month}}</span></h2>\
                                       <p class="tm-figure-description">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\
                                       <a href="/images/2020/5/1.jpg" class="abc"></a>\
                                   </figcaption>\
                               </figure>\
                           </div>\
                       </div>'
});

$(window).load(function(){
    $('.zzcc').magnificPopup({
        delegate: 'a', // child items selector, by clicking on it popup will open
        type: 'image',
        closeBtnInside: true,
        gallery:{enabled:true}
    });
})