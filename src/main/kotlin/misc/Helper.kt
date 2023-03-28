package misc

import java.awt.Color
import java.awt.Graphics
import java.awt.image.BufferedImage
import java.io.File
import java.nio.file.Files


object Helper {
    fun BufferedImage.copy() : BufferedImage{
        val b = BufferedImage(this.width, this.height, this.type)
        val g = b.graphics
        g.drawImage(this, 0, 0, null)
        g.dispose()
        return b
    }

    fun deleteInDirectory(directory: File) {
        Files.walk(directory.toPath())
            .filter { Files.isRegularFile(it) }
            .map { it.toFile() }
            .forEach { it.delete() }
    }

    fun BufferedImage.isTransparent(x: Int, y: Int): Boolean {
        val pixel: Int = this.getRGB(x, y)
        return pixel shr 24 == 0x00
    }

    fun Graphics.drawFirst(color : Color){
        this.color = color
        this.fillRect(36,12,16,8)
        this.fillRect(36,20,4,8)
        this.fillRect(44,20,4,16)
        this.fillRect(48,20, 4, 12)
    }

    fun Graphics.drawSecond(color : Color){
        this.color = color
        this.fillRect(36,28,4,28)
        this.fillRect(40,40, 4,20)
        this.fillRect(44,36,4,12)
        this.fillRect(44,52,4,8)
        this.fillRect(48,32,4,24)
    }
}