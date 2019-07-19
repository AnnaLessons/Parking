

class Person (val name: String,
              money: Double = 0.0) {

    var money = money
        set(value) {
            field = value
            if(field < 0) {
                println("$name погряз в долгах (долг = ${-field})")
            } else println("счет клиента $name = $field")

        }
}