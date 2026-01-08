//writing the basic program
//below is the entry point to the our program
//Note : Kotlin identifies the type at compile time using type inference.
fun main(){
    println("Hello Kotlin Manoj Here Learning How the Android Development Works");

    //how to declare the variables
    val num = 20;

    println("num : " + num);

    //    now if I have to give the type to the any variable
    val num1: Int = 45;
    println("num1 : " + num1);

//    now for the decimal I can Use the Float and the Double for float I have to use the suffix as the f
    val decimalNumber: Float = 3.14f;
    println("decimalNumber: " + decimalNumber);


    val biggerRangeDecimalNumber : Double = 4.6666666;
    println("biggerRangeDecimalNumber : " + biggerRangeDecimalNumber);

    val isConnected = false;
    println("isConnected : " + isConnected);

//    Imp Note :
//    for the above Kotlin identifies the type at compile time using type inference. means it will re-write internally as the below
//    val isConnected: Boolean = false

//    Strings Data Type
    val userName:String = "Manoj Katkar";
    println("userName : " + userName);


    // -------------------------------
    // val → Immutable (read-only)
    // -------------------------------

    // Declaring a val variable
    val finalNumber: Int = 25

    // Reassignment is NOT allowed
    // finalNumber = 34    // ❌ Compilation Error: Val cannot be reassigned

    println("finalNumber : $finalNumber")


    // -------------------------------
    // var → Mutable
    // -------------------------------

    // Declaring a var variable
    var num5 = 35

    // Reassignment is allowed
    num5 = 67

    println("num5 : $num5")

//    Notes :
    // val  → value cannot be reassigned (immutable reference)
    // var  → value can be reassigned (mutable reference)

    // Best Practice:
    // Always prefer `val`
    // Use `var` only when you really need to change the value



    // =========================================
    // 1️⃣ Arithmetic Operators
    // =========================================
    val a = 10
    val b = 3

    println("Arithmetic Operators:")
    println("a + b = ${a + b}")   // Addition → 13
    println("a - b = ${a - b}")   // Subtraction → 7
    println("a * b = ${a * b}")   // Multiplication → 30
    println("a / b = ${a / b}")   // Division → 3 (Integer division)
    println("a % b = ${a % b}")   // Modulus → 1


    // =========================================
    // 2️⃣ Comparison Operators
    // =========================================
    val x = 20
    val y = 25

    println("\nComparison Operators:")
    println("x == y : ${x == y}")   // Equal to → false
    println("x != y : ${x != y}")   // Not equal to → true
    println("x > y  : ${x > y}")    // Greater than → false
    println("x < y  : ${x < y}")    // Less than → true
    println("x >= y : ${x >= y}")   // Greater than or equal → false
    println("x <= y : ${x <= y}")   // Less than or equal → true


    // =========================================
    // 3️⃣ Logical Operators
    // =========================================
    val isAdult = true
    val hasID = false

    println("\nLogical Operators:")
    println("isAdult && hasID : ${isAdult && hasID}") // AND → false
    println("isAdult || hasID : ${isAdult || hasID}") // OR  → true
    println("!isAdult        : ${!isAdult}")          // NOT → false

// Arithmetic Operators → Work on numbers
// Comparison Operators → Always return Boolean (true / false)
// Logical Operators → Work only on Boolean values

// &&  → AND (both must be true)
// ||  → OR  (at least one true)
// !   → NOT (reverse the result)


    //--------------------------------- Bitwise Operators in Kotlin ------------------------------------//
    val userPermissionMask = 10   // Binary: 1010
    val adminPermissionMask = 6   // Binary: 0110

    // Bitwise AND
    println(
        "AND Result = ${userPermissionMask and adminPermissionMask}"
    ) // 2 → 0010

    // Bitwise OR
    println(
        "OR Result = ${userPermissionMask or adminPermissionMask}"
    ) // 14 → 1110

    // Bitwise XOR
    println(
        "XOR Result = ${userPermissionMask xor adminPermissionMask}"
    ) // 12 → 1100

    // Bitwise NOT
    println(
        "NOT Result = ${userPermissionMask.inv()}"
    )

    // Left Shift
    println(
        "Left Shift = ${userPermissionMask shl 1}"
    ) // 20 → 10100

    // Right Shift (Signed)
    println(
        "Right Shift = ${userPermissionMask shr 1}"
    ) // 5 → 0101

    // Unsigned Right Shift
    println(
        "Unsigned Right Shift = ${userPermissionMask ushr 1}"
    )






    //-------------------------------------- Operator Overloading in Kotlin ---------------------------
//    | Operator | Function       |
//| -------- | -------------- |
//| `+`      | `plus()`       |
//| `-`      | `minus()`      |
//| `*`      | `times()`      |
//| `/`      | `div()`        |
//| `%`      | `rem()`        |
//| `==`     | `equals()`     |
//| `[]`     | `get()`        |
//| `+=`     | `plusAssign()` |
//| `<`      | `compareTo()`  |



    val mobileScreen = ScreenSize(360, 640)
    val tabletScreen = ScreenSize(800, 1280)

    val combinedScreen = mobileScreen + tabletScreen

    println(combinedScreen)
    // Output: ScreenSize(width=1160, height=1920)





    //----------------------------------------- Difference Between == and === --------------------------
    val firstUsername = String("KotlinUser".toCharArray())
    val secondUsername = String("KotlinUser".toCharArray())
    val referenceUsername = firstUsername

// Value comparison
    println(firstUsername == secondUsername)   // true

// Reference comparison
    println(firstUsername === secondUsername)  // false

    println(firstUsername == referenceUsername)   // true
    println(firstUsername === referenceUsername)  // true


    //Notes :
    // ==   → Compares VALUES (calls equals())
    // ===  → Compares MEMORY REFERENCES
    // Kotlin is strictly type-safe
    // === is rarely used in business logic


}

data class ScreenSize(
    val width: Int,
    val height: Int
) {
    operator fun plus(otherSize: ScreenSize): ScreenSize {
        return ScreenSize(
            this.width + otherSize.width,
            this.height + otherSize.height
        )
    }
}



