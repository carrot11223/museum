import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussbowuguan from '@/views/modules/discussbowuguan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import wenwutongji from '@/views/modules/wenwutongji/list'
    import tongzhigonggao from '@/views/modules/tongzhigonggao/list'
    import zhanlanxinxi from '@/views/modules/zhanlanxinxi/list'
    import discusszhanlanxinxi from '@/views/modules/discusszhanlanxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import discusswenwuxinxi from '@/views/modules/discusswenwuxinxi/list'
    import wenwuxinxi from '@/views/modules/wenwuxinxi/list'
    import wenwuleibie from '@/views/modules/wenwuleibie/list'
    import config from '@/views/modules/config/list'
    import bowuguan from '@/views/modules/bowuguan/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discussbowuguan',
        name: '博物馆评论',
        component: discussbowuguan
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/wenwutongji',
        name: '文物统计',
        component: wenwutongji
      }
      ,{
	path: '/tongzhigonggao',
        name: '通知公告',
        component: tongzhigonggao
      }
      ,{
	path: '/zhanlanxinxi',
        name: '展览信息',
        component: zhanlanxinxi
      }
      ,{
	path: '/discusszhanlanxinxi',
        name: '展览信息评论',
        component: discusszhanlanxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/discusswenwuxinxi',
        name: '文物信息评论',
        component: discusswenwuxinxi
      }
      ,{
	path: '/wenwuxinxi',
        name: '文物信息',
        component: wenwuxinxi
      }
      ,{
	path: '/wenwuleibie',
        name: '文物类别',
        component: wenwuleibie
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/bowuguan',
        name: '博物馆',
        component: bowuguan
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
