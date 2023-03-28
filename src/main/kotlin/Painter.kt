import misc.ColorEnum
import misc.Helper.copy
import misc.Helper.drawFirst
import misc.Helper.drawSecond
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import java.nio.file.Path
import java.util.DoubleSummaryStatistics
import javax.imageio.ImageIO

object Painter {

    //val stuff = File(System.getProperty("user.dir") + "/stuff")

    var empty : BufferedImage? = null

    //val created = File(stuff.path + "/created")


    fun paintAll(path : Path){
        /*
        var num = 1

        val compoundImage = empty?.copy()

        val i = ColorEnum.values().iterator()
        while (i.hasNext()){
            val color1 = i.next().color

            val j = ColorEnum.values().iterator()
            while (j.hasNext()) {

                if (num > 3025)
                    return

                val color2 = j.next().color

                if (color1 != color2) {

                    println("drawing $num")

                    val compoundFile = File("$path/Compound $num.png")
                    compoundFile.createNewFile()

                    val graphics = compoundImage?.graphics

                    graphics?.drawFirst(color1)
                    graphics?.drawSecond(color2)

                    ImageIO.write(compoundImage, "png", compoundFile)
                    num++
                }
            }
        }
        */
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

        println("drawing $num")

        val compoundFile = File("$path/Compound $num.png")
        compoundFile.createNewFile()

        val graphics = compoundImage?.graphics

        graphics?.drawFirst(ColorEnum.getColor(quotient))
        graphics?.drawSecond(ColorEnum.getColor(remainder))

        ImageIO.write(compoundImage, "png", compoundFile)

    }

}