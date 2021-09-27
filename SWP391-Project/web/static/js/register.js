/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function onSubmitRegister() {
    var raw = document.getElementById("text-547b").value;
    var reenter = document.getElementById("text-1571").value;
    var isValidPhoneNumber = validatePhoneNumber();
    if (raw !== reenter) {
        return false;
    }
    return true;
}
function isPasswordMapped() {
    var raw = document.getElementById("text-547b").value;
    var reenter = document.getElementById("text-1571").value;
    if (raw !== reenter) {
        return false;
    }
    return true;
}
function checkReEnterPassword(pointer) {
    var raw = document.getElementById("text-547b").value;
    var reenter = document.getElementById("text-1571").value;
    var isMapped = isPasswordMapped();
    if (pointer === '0') {
        if (reenter === "") {
            return;
        }
    } else if (pointer === '1') {
        if (raw === "") {
            return;
        }
    }
    var clientError = document.getElementById("message-client-password");
    if (!isMapped) {
        var serverError = document.getElementById("message-server");
        if (serverError !== null) {
            serverError.style.display = "none";
        }
        clientError.style.display = "block";
    } else {
        clientError.style.display = "none";
    }
}

function displayTextPhoneNumber() {
    var isValid = validatePhoneNumber();
    var tag = document.getElementById("text-19ae");
    var clientError = document.getElementById("message-client-phone");
    if (isValid) {
        tag.style.borderColor = "#b3b3b3";
        clientError.style.display = "none";
    } else {
        tag.style.borderColor = "red";
        clientError.style.display = "block";
    }
    function validatePhoneNumber() {
        var tag = document.getElementById("text-19ae");
        var inputtxt = tag.value;
        if(inputtxt === ""){
            return true;
        }
        var phoneno = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
        if (inputtxt.match(phoneno)) {
            return true;
        }
        return false;
    }
}