package rnd.mate00.codewars

/**
 * https://www.codewars.com/kata/5efae11e2d12df00331f91a6/train/groovy
 *
 */
class CrackThePin {

    static def crack(hash) {
        (0..99999).collect {
            it.toString().padLeft(5, '0')
        }.find {
            it.md5() == hash
        }
    }
}
