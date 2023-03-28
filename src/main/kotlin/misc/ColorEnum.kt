package misc

import java.awt.Color

enum class ColorEnum(val color: Color) {
    WHITE(Color(255,255,255,255)),
    GREY(Color(153,153,153,255)),
    GREYISH(Color(103,125,144, 255)),
    LIGHT_GRAY(Color(157, 157, 163, 255)),
    DARK_GRAY(Color(82, 82, 84, 255)),
    BLACK(Color(31, 3, 3, 255)),
    PASTEL_PINK(Color(255,130,241, 255)),
    PINK1(Color(255,142,197, 255)),
    PINK2(Color(254,93,159, 255)),
    PINKISH(Color(201, 30, 113, 255)),
    BEIGE(Color(201, 173, 119, 255)),
    STRONG_BLUE(Color(48,18,56, 255)),
    LIGHTER_BLUE(Color(0,161,221,255)),
    WEIRD_BLUE(Color(69,23,233, 255)),
    BLUE(Color(17, 89, 207, 255)),
    GLOWING_BLUE(Color(76,139,255, 255)),
    VIOLET(Color(131, 7, 219, 255)),
    GLOWING_PURPLE(Color(137,1,189, 255)),
    STRONG_RED(Color(194,15,21, 255)),
    REDISH(Color(174, 54, 56, 255)),
    RED1(Color(199, 16, 16, 255)),
    RED2(Color(255,46,31, 255)),
    RED3(Color(255,76,51, 255)),
    BEIGE2(Color(255,107,71, 255)),
    BEIGE3(Color(255,138,92, 255)),
    BROWN(Color(177,117,76, 255)),
    STRONG_BROWN(Color(102,45,26, 255)),
    LIGHT_BEIGE(Color(250,240,230, 255)),
    PASTELBLUE1(Color(207,226,243, 255)),
    PASTELBLUE2(Color(207,226,243, 255)),
    CYAN(Color(26, 210, 217, 255)),
    DARK_CYAN(Color(104, 160, 166, 255)),
    TURQUOISE1(Color(51,151,141, 255)),
    TURQUOISE2(Color(62,187,174, 255)),
    TURQUOISE3(Color(64,224,208, 255)),
    TURQUOISE4(Color(108,255,240, 255)),
    TURQUOISE5(Color(166,255,246, 255)),
    YELLOW(Color(255,255,0, 255)),
    DARKER_YELLOW(Color(235,196,76, 255)),
    GLOWING_YELLOW(Color(255,170,0, 255)),
    ORANGISH(Color(226, 176, 70,255)),
    YELLOWISH(Color(206, 209, 110, 255)),
    PASTEL_GREEN(Color(98,255,139, 255)),
    GREEN2(Color(152,181,116,255)),
    GREEN(Color(75, 145, 63, 255)),
    LIGHT_GREEN(Color(109, 245, 42, 255)),
    GLOWING_GREEN(Color(0,178,122, 255)),
    DARK_GREEN(Color(4, 67, 48, 255)),
    MUTED_GREEN1(Color(47,89,42, 255)),
    MUTED_GREEN2(Color(56,107,50, 255)),
    MUTED_GREEN3(Color(65,124,58, 255)),
    MUTED_GREEN4(Color(65,124,58, 255)),
    MUTED_GREEN5(Color(74,141,66, 255)),
    ORANGE(Color(227, 100, 20, 255)),
    MUTED_ORANGE1(Color(250,127,8, 255)),
    MUTED_ORANGE2(Color(251,140,33, 255)),
    MUTED_ORANGE3(Color(252,179,108, 255));

    companion object {
        fun getColors(): ArrayList<Color> {
            val colors = arrayListOf<Color>()
            val i = ColorEnum.values().iterator()
            while (i.hasNext())
                colors.add(i.next().color)

            return colors
        }

        // 0 up to 55
        fun getColor(num: Int): Color {
            return getColors()[num]
        }
    }
}