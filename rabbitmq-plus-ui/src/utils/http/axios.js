import axios from "axios";

const instance = axios.create({
    baseURL: '/api',
    timeout: 50000
})
export default instance;