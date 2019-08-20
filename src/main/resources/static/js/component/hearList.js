Vue.component('headerlist-component', {
		props: ['yearList'],
		template: '<div class="cd-slider-nav">\
                        <p>我是hearderlist-component</p>\
                        <p>{{yearList}}</p>\
                        <nav class="navbar">\
                            <div class="tm-navbar-bg">\
                                <a class="navbar-brand text-uppercase" href="#"><i class="fa fa-gears tm-brand-icon"></i>Multi Color</a>\
                                <button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#tmNavbar">\
                                                &#9776;\
                                </button>\
                                <div class="collapse navbar-toggleable-md text-xs-center text-uppercase tm-navbar" id="tmNavbar">\
                                    <ul class="nav navbar-nav">\
                                        <li v-for="year in yearList" class="nav-item active selected">\
                                            <a class="nav-link" href="#0" data-no="1">{{year.fileName}}</a>\
                                        </li>\
                                    </ul>\
                                </div>\
                            </div>\
                        </nav>\
		            </div>'

});