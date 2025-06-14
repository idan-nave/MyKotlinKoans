fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    if (client == null || message == null) return
    mailer.sendMessage(client.personalInfo?.email ?: return, message)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
