Vue.component('headerlist-component', {
        props: ['yearlist'],
		data () {
            return {
                seletecdClass: 'nav-item active selected',
                UnseletecdClass: 'nav-item',
            }
        },
        methods: {
        },
        created:function(){
                  console.log("headerlist component created");
              },
        mounted:function(){
                },
        template: '<div class="cd-slider-nav">\
                    <nav class="navbar">\
                        <div class="tm-navbar-bg">\
                            <a class="navbar-brand text-uppercase" href="#"><i class="fa fa-gears tm-brand-icon"></i>Multi Color</a>\
                            <button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#tmNavbar">\
                                            &#9776;\
                            </button>\
                            <div class="collapse navbar-toggleable-md text-xs-center text-uppercase tm-navbar" id="tmNavbar">\
                                <ul class="nav navbar-nav">\
                                    <li v-for="(year, index) in yearlist"  v-bind:class="[index == 0 ? seletecdClass : UnseletecdClass]">\
                                        <a class="nav-link" href="#0" v-bind:data-no="index+1">{{year.fileName}}</a>\
                                    </li>\
                                </ul>\
                            </div>\
                        </div>\
                    </nav>\
                </div>'

});