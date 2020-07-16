package evan.chen.tutorial.tdd.androidunittestsample

class RegisterVerify {

    fun isLoginIdVerify(loginId: String): Boolean {
        var isLoginIdOK = false

        if (loginId.length >= 6) {
            if (loginId.toUpperCase().first() in 'A'..'Z') {
                isLoginIdOK = true
            }
        }
        return isLoginIdOK
    }
}