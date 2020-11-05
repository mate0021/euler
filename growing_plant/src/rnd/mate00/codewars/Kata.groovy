package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/58941fec8afa3618c9000184/train/groovy
 */
class Kata {

    static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        def days = 1
        def currentHeight = 0

        while ((currentHeight + upSpeed) < desiredHeight) {
            currentHeight += (upSpeed - downSpeed)
            days++
        }

        days
    }
}
