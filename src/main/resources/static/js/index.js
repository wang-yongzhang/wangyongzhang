window.setInterval(function () {
    var xmlhttp;
    if (window.XMLHttpRequest) {
        //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp = new XMLHttpRequest();
    } else {
        // IE6, IE5 浏览器执行代码
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("GET", "http://127.0.0.1:8080/app/ping", false)
    xmlhttp.send()
    xmlhttp.onreadystatechange = function () {
        let readyState = xmlhttp.readyState;
        let status = xmlhttp.status;
        let responseText = xmlhttp.responseText;
        if (readyState === 4 && status === 200) {
            console.log(responseText)
        }
    }
}, 1000)