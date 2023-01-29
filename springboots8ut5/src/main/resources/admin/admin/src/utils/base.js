const base = {
    get() {
        return {
            url : "http://localhost:8080/springboots8ut5/",
            name: "springboots8ut5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboots8ut5/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "博物馆信息管理"
        } 
    }
}
export default base
