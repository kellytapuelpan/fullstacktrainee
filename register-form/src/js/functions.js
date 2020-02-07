(function() {
	'use strict';
	window.addEventListener('load', function() {
		var forms = document.getElementsByClassName('needs-validation');
		var validation = Array.prototype.filter.call(forms, function(form) {
		form.addEventListener('submit', function(event) {
			if (form.checkValidity() === false) {
				event.preventDefault();
				event.stopPropagation();
			}
			form.classList.add('was-validated');
			}, false);
		});
	}, false);

	$('form, #invalid_email').hide();
    $('h2').click(function(e){
        $('form').slideToggle();
        e.preventDefault();
    });
    $('#register-button').click(function(){
    	if(IsEmail(email)==false){
            $('#invalid_email').show();
            return false;
        }
    });
	$('#reset-button').click(function(){
        $('form')[0].reset();
        $('input, label').removeClass('active');
        $('input, label').removeClass('error');
    });

    function IsEmail(email) {
        var regex = /^([a-zA-Z0-9_\.\-\+])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        if(!regex.test(email)) {
            return false;
        }else{
            return true;
        }
    }
})();
