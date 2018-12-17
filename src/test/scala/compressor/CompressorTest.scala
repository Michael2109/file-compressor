package compressor

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}

import scala.io.Source

@RunWith(classOf[JUnitRunner])
class CompressorTest extends FunSpec with Matchers {
  describe("Compression tests") {
    it("Validates compression and decompression") {
      val fileData = Source.fromResource("files/SampleTextFile_10kb.txt").getLines().mkString("\n")

      val compressedData = Compressor.compress(fileData)
      val decompressedData = Compressor.decompress(compressedData)

      fileData shouldBe decompressedData

    }
    it("Tests compression speed"){

    }
    it("Tests file compression sizes"){

    }
  }
}
