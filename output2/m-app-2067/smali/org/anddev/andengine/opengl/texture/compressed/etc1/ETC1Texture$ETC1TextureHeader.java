public class org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture$ETC1TextureHeader {
	 /* # instance fields */
	 private final java.nio.ByteBuffer mDataByteBuffer;
	 private final Integer mHeight;
	 private final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture$ETC1TextureHeader ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/16 v2, 0x10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* array-length v0, p1 */
		 /* if-eq v0, v2, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "Invalid "; // const-string v2, "Invalid "
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v2 ).getSimpleName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "!"; // const-string v2, "!"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 java.nio.ByteBuffer .allocateDirect ( v2 );
	 java.nio.ByteOrder .nativeOrder ( );
	 (( java.nio.ByteBuffer ) v0 ).order ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
	 this.mDataByteBuffer = v0;
	 v0 = this.mDataByteBuffer;
	 (( java.nio.ByteBuffer ) v0 ).put ( p1, v3, v2 ); // invoke-virtual {v0, p1, v3, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;
	 v0 = this.mDataByteBuffer;
	 (( java.nio.ByteBuffer ) v0 ).position ( v3 ); // invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
	 v0 = this.mDataByteBuffer;
	 v0 = 	 android.opengl.ETC1 .isValid ( v0 );
	 /* if-nez v0, :cond_1 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Invalid "; // const-string v2, "Invalid "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) v2 ).getSimpleName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "!"; // const-string v2, "!"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_1
v0 = this.mDataByteBuffer;
v0 = android.opengl.ETC1 .getWidth ( v0 );
/* iput v0, p0, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture$ETC1TextureHeader;->mWidth:I */
v0 = this.mDataByteBuffer;
v0 = android.opengl.ETC1 .getHeight ( v0 );
/* iput v0, p0, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture$ETC1TextureHeader;->mHeight:I */
return;
} // .end method
/* # virtual methods */
public Integer getHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture$ETC1TextureHeader;->mHeight:I */
} // .end method
public Integer getWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture$ETC1TextureHeader;->mWidth:I */
} // .end method
