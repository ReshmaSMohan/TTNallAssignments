function myfunction(formData) {
    var register = $.ajax({
        method: "POST",
        url:"/registerEmployee",
        data: formData
        }
    );

    register.done(
        function (data) {
            console.log(data);
            $("#loading").text(data+" registered");

        }
    );

    register.fail(
        function () {
            console.log("error");
        }
    )
}
