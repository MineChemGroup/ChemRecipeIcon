import java.io.File
import java.net.PasswordAuthentication
import java.net.URL
import javax.imageio.ImageIO
import kotlin.io.path.createTempDirectory

fun main(args: Array<String>) {

    //Painter.stuff.mkdir()

    //Painter.created.mkdir()

    Painter.empty = ImageIO.read(Painter.javaClass.getResource("/empty.png"))

    //Painter.paintAll(Painter.created.toPath())
    //Painter.paintAll(Painter.created.toPath())
}