Vue.component('gallery-component', {
            props: ['yearlist'],
            data () {
                return {
                    seletecdClass: 'selected',
                    UnseletecdClass: '',
                }
            },
            methods: {
            },
            created:function(){
                      console.log("gallery-component created");
                  },
            mounted:function(){
                    },
            template: '<ul class="cd-hero-slider">\
                            <li v-for="(year, index) in yearlist" :class="[index == 0 ? seletecdClass : UnseletecdClass]">\
                                <div class="cd-full-width">\
                                    <div class="container-fluid js-tm-page-content" data-page-no="index+1" data-page-type="gallery">\
                                        <div class="tm-img-gallery-container">\
                                            <div class="tm-img-gallery gallery-one">\
                                                <div class="tm-img-gallery-info-container">\
                                                    <h2 class="tm-text-title tm-gallery-title tm-white"><span class="tm-white">Multi Color Image Gallery</span></h2>\
                                                    <p class="tm-text">This responsive HTML template includes three gallery pages. Multi color is designed by Tooplate. You may use this layout for your website.</p>\
                                                    <pageimgitem-component :year="year.fileName"></pageimgitem-component>\
                                                </div>\
                                            </div>\
                                        </div>\
                                    </div>\
                                </div>\
                            </li>\
                       </ul>'
});