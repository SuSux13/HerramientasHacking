class SendMail {
    var para: String = "";
    var email: String = "";
    var asunto: String = "";
    var mensaje: String = "";
    val mesagge = "Tu mensaje ha sido enviado";
}



fun main(args: Array<String>) {
    val env = SendMail();
    env.email = "TuCorreo@email.tor.ze";
    env.para = "admin@tor.ze";
    env.asunto = "El titulo de encabezado";
    env.mensaje = "Redacta a tu amigo"
    println(env.mesagge);
}
