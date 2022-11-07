public class com.openfeint.internal.ImagePicker {
	 /* .source "ImagePicker.java" */
	 /* # static fields */
	 public static final Integer IMAGE_PICKER_REQ_ID;
	 protected static final java.lang.String TAG;
	 /* # direct methods */
	 public com.openfeint.internal.ImagePicker ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void compressAndUpload ( android.graphics.Bitmap p0, java.lang.String p1, com.openfeint.internal.OpenFeintInternal$IUploadDelegate p2 ) {
		 /* .locals 3 */
		 /* .param p0, "image" # Landroid/graphics/Bitmap; */
		 /* .param p1, "apiPath" # Ljava/lang/String; */
		 /* .param p2, "delegate" # Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate; */
		 /* .prologue */
		 /* .line 72 */
		 /* new-instance v0, Ljava/io/ByteArrayOutputStream; */
		 /* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
		 /* .line 73 */
		 /* .local v0, "out":Ljava/io/ByteArrayOutputStream; */
		 v1 = android.graphics.Bitmap$CompressFormat.PNG;
		 /* const/16 v2, 0x64 */
		 (( android.graphics.Bitmap ) p0 ).compress ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
		 /* .line 74 */
		 com.openfeint.internal.ImagePicker .upload ( p1,v0,p2 );
		 /* .line 75 */
		 return;
	 } // .end method
	 public static Boolean isImagePickerActivityResult ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "requestCode" # I */
		 /* .prologue */
		 /* .line 41 */
		 /* const/16 v0, 0x2719 */
		 /* if-ne p0, v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static android.graphics.Bitmap onImagePickerActivityResult ( android.app.Activity p0, Integer p1, Integer p2, android.content.Intent p3 ) {
/* .locals 12 */
/* .param p0, "currentActivity" # Landroid/app/Activity; */
/* .param p1, "resultCode" # I */
/* .param p2, "maxLength" # I */
/* .param p3, "returnedIntent" # Landroid/content/Intent; */
/* .prologue */
/* .line 45 */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p1, v0, :cond_1 */
/* .line 46 */
(( android.content.Intent ) p3 ).getData ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
/* .line 47 */
/* .local v1, "selectedImage":Landroid/net/Uri; */
int v0 = 2; // const/4 v0, 0x2
/* new-array v2, v0, [Ljava/lang/String; */
int v0 = 0; // const/4 v0, 0x0
final String v3 = "_data"; // const-string v3, "_data"
/* aput-object v3, v2, v0 */
int v0 = 1; // const/4 v0, 0x1
final String v3 = "orientation"; // const-string v3, "orientation"
/* aput-object v3, v2, v0 */
/* .line 49 */
/* .local v2, "columns":[Ljava/lang/String; */
(( android.app.Activity ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* invoke-virtual/range {v0 ..v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 50 */
/* .local v7, "cursor":Landroid/database/Cursor; */
if ( v7 != null) { // if-eqz v7, :cond_0
	 /* .line 51 */
	 /* .line 53 */
	 int v0 = 0; // const/4 v0, 0x0
	 v6 = 	 /* aget-object v0, v2, v0 */
	 /* .line 54 */
	 /* .local v6, "columnIndex":I */
	 /* .line 55 */
	 /* .local v8, "filePath":Ljava/lang/String; */
	 int v0 = 1; // const/4 v0, 0x1
	 v11 = 	 v0 = 	 /* aget-object v0, v2, v0 */
	 /* .line 56 */
	 /* .local v11, "rotation":I */
	 /* .line 58 */
	 com.openfeint.internal.ImagePicker .resize ( v8,p2,v11 );
	 /* .line 59 */
	 /* .local v9, "image":Landroid/graphics/Bitmap; */
	 final String v0 = "ImagePicker"; // const-string v0, "ImagePicker"
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "image! "; // const-string v4, "image! "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v4 = 	 (( android.graphics.Bitmap ) v9 ).getWidth ( ); // invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v4 = "x"; // const-string v4, "x"
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v4 = 	 (( android.graphics.Bitmap ) v9 ).getHeight ( ); // invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.openfeint.internal.OpenFeintInternal .log ( v0,v3 );
	 /* .line 68 */
} // .end local v1 # "selectedImage":Landroid/net/Uri;
} // .end local v2 # "columns":[Ljava/lang/String;
} // .end local v6 # "columnIndex":I
} // .end local v7 # "cursor":Landroid/database/Cursor;
} // .end local v8 # "filePath":Ljava/lang/String;
} // .end local v9 # "image":Landroid/graphics/Bitmap;
} // .end local v11 # "rotation":I
} // :goto_0
/* .line 63 */
/* .restart local v1 # "selectedImage":Landroid/net/Uri; */
/* .restart local v2 # "columns":[Ljava/lang/String; */
/* .restart local v7 # "cursor":Landroid/database/Cursor; */
} // :cond_0
com.openfeint.internal.OpenFeintInternal .getRString ( v0 );
/* .line 64 */
/* .local v10, "msg":Ljava/lang/String; */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
int v3 = 1; // const/4 v3, 0x1
android.widget.Toast .makeText ( v0,v10,v3 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* .line 68 */
} // .end local v1 # "selectedImage":Landroid/net/Uri;
} // .end local v2 # "columns":[Ljava/lang/String;
} // .end local v7 # "cursor":Landroid/database/Cursor;
} // .end local v10 # "msg":Ljava/lang/String;
} // :cond_1
int v9 = 0; // const/4 v9, 0x0
} // .end method
private static android.graphics.Bitmap preScaleImage ( java.lang.String p0, Integer p1 ) {
/* .locals 9 */
/* .param p0, "filePath" # Ljava/lang/String; */
/* .param p1, "maxLength" # I */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 100 */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 104 */
/* .local v1, "f":Ljava/io/File; */
try { // :try_start_0
/* new-instance v3, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
/* .line 105 */
/* .local v3, "o":Landroid/graphics/BitmapFactory$Options; */
int v7 = 1; // const/4 v7, 0x1
/* iput-boolean v7, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z */
/* .line 106 */
/* new-instance v7, Ljava/io/FileInputStream; */
/* invoke-direct {v7, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
int v8 = 0; // const/4 v8, 0x0
android.graphics.BitmapFactory .decodeStream ( v7,v8,v3 );
/* .line 109 */
/* iget v7, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
/* iget v8, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I */
v2 = java.lang.Math .min ( v7,v8 );
/* .line 110 */
/* .local v2, "minDim":I */
int v5 = 1; // const/4 v5, 0x1
/* .line 111 */
/* .local v5, "scale":I */
} // :goto_0
/* div-int/lit8 v7, v2, 0x2 */
/* if-le v7, p1, :cond_0 */
/* .line 112 */
/* div-int/lit8 v2, v2, 0x2 */
/* .line 113 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 117 */
} // :cond_0
/* new-instance v4, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
/* .line 118 */
/* .local v4, "o2":Landroid/graphics/BitmapFactory$Options; */
/* iput v5, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I */
/* .line 119 */
/* new-instance v7, Ljava/io/FileInputStream; */
/* invoke-direct {v7, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
int v8 = 0; // const/4 v8, 0x0
android.graphics.BitmapFactory .decodeStream ( v7,v8,v4 );
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 124 */
} // .end local v2 # "minDim":I
} // .end local v3 # "o":Landroid/graphics/BitmapFactory$Options;
} // .end local v4 # "o2":Landroid/graphics/BitmapFactory$Options;
} // .end local v5 # "scale":I
} // :goto_1
/* .line 121 */
/* :catch_0 */
/* move-exception v0 */
/* .line 122 */
/* .local v0, "e":Ljava/io/FileNotFoundException; */
final String v7 = "ImagePicker"; // const-string v7, "ImagePicker"
(( java.io.FileNotFoundException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/FileNotFoundException;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v7,v8 );
} // .end method
private static android.graphics.Bitmap resize ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 12 */
/* .param p0, "filePath" # Ljava/lang/String; */
/* .param p1, "maxLength" # I */
/* .param p2, "rotation" # I */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 78 */
com.openfeint.internal.ImagePicker .preScaleImage ( p0,p1 );
/* .line 80 */
/* .local v0, "image":Landroid/graphics/Bitmap; */
v10 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 81 */
/* .local v10, "width":I */
v7 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 82 */
/* .local v7, "height":I */
/* if-le v7, v10, :cond_0 */
int v9 = 1; // const/4 v9, 0x1
/* .line 85 */
/* .local v9, "tall":Z */
} // :goto_0
if ( v9 != null) { // if-eqz v9, :cond_1
/* move v1, v6 */
/* .line 86 */
/* .local v1, "_x":I */
} // :goto_1
if ( v9 != null) { // if-eqz v9, :cond_2
/* sub-int v4, v7, v10 */
/* div-int/lit8 v2, v4, 0x2 */
/* .line 87 */
/* .local v2, "_y":I */
} // :goto_2
if ( v9 != null) { // if-eqz v9, :cond_3
/* move v3, v10 */
/* .line 89 */
/* .local v3, "_length":I */
} // :goto_3
/* int-to-float v4, p1 */
/* int-to-float v11, v3 */
/* div-float v8, v4, v11 */
/* .line 91 */
/* .local v8, "scale":F */
/* new-instance v5, Landroid/graphics/Matrix; */
/* invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V */
/* .line 92 */
/* .local v5, "transform":Landroid/graphics/Matrix; */
(( android.graphics.Matrix ) v5 ).postScale ( v8, v8 ); // invoke-virtual {v5, v8, v8}, Landroid/graphics/Matrix;->postScale(FF)Z
/* .line 93 */
/* int-to-float v4, p2 */
(( android.graphics.Matrix ) v5 ).postRotate ( v4 ); // invoke-virtual {v5, v4}, Landroid/graphics/Matrix;->postRotate(F)Z
/* move v4, v3 */
/* .line 95 */
/* invoke-static/range {v0 ..v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
} // .end local v1 # "_x":I
} // .end local v2 # "_y":I
} // .end local v3 # "_length":I
} // .end local v5 # "transform":Landroid/graphics/Matrix;
} // .end local v8 # "scale":F
} // .end local v9 # "tall":Z
} // :cond_0
/* move v9, v6 */
/* .line 82 */
/* .line 85 */
/* .restart local v9 # "tall":Z */
} // :cond_1
/* sub-int v4, v10, v7 */
/* div-int/lit8 v1, v4, 0x2 */
/* .restart local v1 # "_x":I */
} // :cond_2
/* move v2, v6 */
/* .line 86 */
/* .restart local v2 # "_y":I */
} // :cond_3
/* move v3, v7 */
/* .line 87 */
} // .end method
public static void show ( android.app.Activity p0 ) {
/* .locals 5 */
/* .param p0, "currentActivity" # Landroid/app/Activity; */
/* .prologue */
/* .line 29 */
final String v3 = "activity"; // const-string v3, "activity"
(( android.app.Activity ) p0 ).getSystemService ( v3 ); // invoke-virtual {p0, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/app/ActivityManager; */
/* .line 30 */
/* .local v0, "am":Landroid/app/ActivityManager; */
/* new-instance v2, Landroid/app/ActivityManager$MemoryInfo; */
/* invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V */
/* .line 31 */
/* .local v2, "mi":Landroid/app/ActivityManager$MemoryInfo; */
(( android.app.ActivityManager ) v0 ).getMemoryInfo ( v2 ); // invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V
/* .line 33 */
/* new-instance v1, Landroid/content/Intent; */
final String v3 = "android.intent.action.PICK"; // const-string v3, "android.intent.action.PICK"
v4 = android.provider.MediaStore$Images$Media.INTERNAL_CONTENT_URI;
/* invoke-direct {v1, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 34 */
/* .local v1, "intent":Landroid/content/Intent; */
final String v3 = "image/*"; // const-string v3, "image/*"
(( android.content.Intent ) v1 ).setType ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
/* .line 35 */
/* const/16 v3, 0x2719 */
(( android.app.Activity ) p0 ).startActivityForResult ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 36 */
return;
} // .end method
private static void upload ( java.lang.String p0, java.io.ByteArrayOutputStream p1, com.openfeint.internal.OpenFeintInternal$IUploadDelegate p2 ) {
/* .locals 6 */
/* .param p0, "apiPath" # Ljava/lang/String; */
/* .param p1, "stream" # Ljava/io/ByteArrayOutputStream; */
/* .param p2, "delegate" # Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate; */
/* .prologue */
/* .line 128 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
final String v2 = "profile.png"; // const-string v2, "profile.png"
(( java.io.ByteArrayOutputStream ) p1 ).toByteArray ( ); // invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
final String v4 = "image/png"; // const-string v4, "image/png"
/* move-object v1, p0 */
/* move-object v5, p2 */
/* invoke-virtual/range {v0 ..v5}, Lcom/openfeint/internal/OpenFeintInternal;->uploadFile(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate;)V */
/* .line 129 */
return;
} // .end method
