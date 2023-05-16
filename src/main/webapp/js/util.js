function getContextPath() {
    var pathName = window.location.pathname;
    var contextPath = pathName.substring(0, pathName.indexOf('/', 1));
    return contextPath;
}