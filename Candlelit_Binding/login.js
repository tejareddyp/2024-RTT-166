const validateEmail = (email) => {
    return email.match(
        /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
    );
};

const validate = () => {
    const $result = $('#result');
    const email = $('#email').val();
    $result.text('');

    if (validateEmail(email)) {
        $result.text(email + ' is valid.');
        $result.css('color', 'green');
    } else {
        $result.text(email + ' is invalid.');
        $result.css('color', 'red');
    }
    return false;
}

$('#email').on('input', validate);

const validateStringLength = () => {
    var classes = document.getElementsByClassName("form-control");
    var values = Array.prototype.map.call(classes, function (el) {

        return el.value;
    });


    const $errorMessage = $('#errorMessage');
    $errorMessage.text("");

    for (let i = 0; i < values.length; i++) {
        if (values[i].length > 50) {
            $errorMessage.text('Text is too long.');
        }
    }
    return false;
}

$('#email').on('input', validateStringLength);
$('#password').on('input', validateStringLength);
