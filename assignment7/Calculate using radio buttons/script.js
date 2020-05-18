

    function solve(){
        var num1 = document.getElementById("Num1").value;
        var num2 = document.getElementById("Num2").value;
        var operations = document.getElementsByName('operation');   
        for(i = 0; i < operations.length; i++) { 
            if(operations[i].checked) {
                var result = eval(num1+operations[i].value+num2);
                document.getElementById("result").innerHTML = "<h2>Result: " + result + "</h2>"; 
            }
        } 
        
    }