package com.fortrade.tiktok

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.media.Image
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.FileProvider
import androidx.navigation.fragment.findNavController
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import kotlinx.android.synthetic.main.item_video.*
import java.io.File


class CameraFragment : Fragment() {

    private lateinit var cheptureVideo: ImageButton
    private lateinit var gallery: ImageView
    private lateinit var videoRec: VideoView
    private lateinit var  builder: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_camera, container, false)

        videoRec = view.findViewById(R.id.videoRec)

//        val videoView = LayoutInflater.from(context).inflate(R.layout.video_upload_dialog,null)
//
//        val camera:Button = videoView.findViewById(R.id.camera_Btn)
//        val gallery:Button = videoView.findViewById(R.id.gallery_Btn)
//        val cancel_Btn:Button = videoView.findViewById(R.id.cancel_Btn)
//
//        builder = AlertDialog.Builder(context)
//            .setView(videoView).create()
//
//        camera.setOnClickListener {
//            builder.dismiss()
//            Toast.makeText(context,"clicked camera",Toast.LENGTH_LONG).show()
//            val intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE);
//            intent.putExtra(MediaStore.EXTRA_DURATION_LIMIT,60)
//            startActivityForResult(intent,1)
//        }
//
//        gallery.setOnClickListener {
//            builder.dismiss()
//            Toast.makeText(context,"clicked gallery",Toast.LENGTH_LONG).show()
//
//            Dexter.withContext(context)
//                .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
//                .withListener(object : PermissionListener {
//                    override fun onPermissionGranted(permissionGrantedResponse: PermissionGrantedResponse) {
//                        val intent = Intent()
//                        intent.type = "video/*"
//                        intent.action = Intent.ACTION_GET_CONTENT
//                        startActivityForResult(intent, 8)
//                    }
//
//                    override fun onPermissionDenied(permissionDeniedResponse: PermissionDeniedResponse) {}
//                    override fun onPermissionRationaleShouldBeShown(
//                        permissionRequest: PermissionRequest,
//                        permissionToken: PermissionToken
//                    ) {
//                        permissionToken.continuePermissionRequest()
//                    }
//                }).check()
//        }
//
//        cancel_Btn.setOnClickListener {
//            builder.dismiss()
//            Toast.makeText(context,"clicked cancel",Toast.LENGTH_LONG).show()
//            findNavController().navigate(R.id.action_cameraFragment_to_homeFragment)
//        }
//
//        builder.setCancelable(false)
//        builder.show()



        return view
    }
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        if (requestCode == 1 && resultCode == Activity.RESULT_OK){
//            builder.dismiss()
//            videoRec.setVideoURI(data?.data)
//            videoRec.start()
//        }
//
//        if (resultCode == Activity.RESULT_OK && requestCode == 8) {
//            if (data?.data != null) {
//                var uri:Uri = data.data!!
//                videoRec.setVideoURI(uri)
//                var mediaController: MediaController = MediaController(context)
//                val retriever = MediaMetadataRetriever()
//                retriever.setDataSource(context, Uri.parse(uri.toString()))
//                val time = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
//                var timeInMillisec = time?.toLong();
//                retriever.release()
//                if (timeInMillisec != null) {
//                    if (timeInMillisec<=60000)
//                    {
//                        builder.dismiss()
//                        videoRec.setMediaController(mediaController)
//                        videoRec.start()
//                    }
//                    else
//                    {
//                        Toast.makeText(getActivity(),"Duration of video more than 60 seconds",Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        }
//    }
}