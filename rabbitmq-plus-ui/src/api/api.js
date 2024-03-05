import http from '../utils/http/http.js'

const login = (data) => {
    return http.post("/api/login/login.do", data);
};

export default {
    login
}