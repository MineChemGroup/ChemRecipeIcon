import misc.ColorEnum
import misc.Helper.copy
import misc.Helper.drawFirst
import misc.Helper.drawSecond
import java.awt.image.BufferedImage
import java.io.File
import java.nio.file.Path
import javax.imageio.ImageIO

object Painter {

    var empty : BufferedImage? = BufferedImage(64,64,6)

    fun paintAll(path : Path){
        for (i in 1..3136)
        paintOne(path, i)
    }

    // 1 up to 3136
    fun paintOne(path: Path, num : Int){
        val compoundImage = empty?.copy()

        val quotient = num / 56
        var remainder = num % 56

        if (quotient == remainder)
            remainder++

        //println("drawing $num")

        val compoundFile = File("$path/$num.png")
        compoundFile.createNewFile()

        val graphics = compoundImage?.graphics

        graphics?.drawFirst(ColorEnum.getColor(quotient))
        graphics?.drawSecond(ColorEnum.getColor(remainder))

        ImageIO.write(compoundImage, "png", compoundFile)

    }

}