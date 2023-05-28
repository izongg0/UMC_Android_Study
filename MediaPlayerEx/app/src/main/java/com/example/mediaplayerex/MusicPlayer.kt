import android.content.Context
import android.media.MediaPlayer
import java.io.File

class MusicPlayer(private val context: Context, private val musicFileName: String) {
    private var mediaPlayer: MediaPlayer? = null

    fun start() {
        val musicFile = File(context.filesDir, musicFileName)
        if (musicFile.exists()) {
            mediaPlayer = MediaPlayer().apply {
                setDataSource(musicFile.absolutePath)
                prepare()
                start()
            }
        }
    }

    fun pause() {
        mediaPlayer?.pause()
    }

    fun resume() {
        mediaPlayer?.start()
    }

    fun stop() {
        mediaPlayer?.apply {
            stop()
            reset()
            release()
        }
        mediaPlayer = null
    }
}
