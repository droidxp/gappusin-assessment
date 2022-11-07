public class org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader {
	 /* # static fields */
	 private static final Integer FORMAT_FLAG_MASK;
	 public static final MAGIC_IDENTIFIER;
	 public static final Integer SIZE;
	 /* # instance fields */
	 private final java.nio.ByteBuffer mDataByteBuffer;
	 private final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat mPVRTextureFormat;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ( ) {
		 /* .locals 1 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [B */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 1 */
		 /* 0x50t */
		 /* 0x56t */
		 /* 0x52t */
		 /* 0x21t */
	 } // .end array-data
} // .end method
public org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ( ) {
	 /* .locals 4 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 java.nio.ByteBuffer .wrap ( p1 );
	 this.mDataByteBuffer = v0;
	 v0 = this.mDataByteBuffer;
	 (( java.nio.ByteBuffer ) v0 ).rewind ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
	 v0 = this.mDataByteBuffer;
	 v1 = java.nio.ByteOrder.LITTLE_ENDIAN;
	 (( java.nio.ByteBuffer ) v0 ).order ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
	 /* const/16 v0, 0x2c */
	 v1 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader.MAGIC_IDENTIFIER;
	 int v2 = 0; // const/4 v2, 0x0
	 v3 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader.MAGIC_IDENTIFIER;
	 /* array-length v3, v3 */
	 v0 = 	 org.anddev.andengine.util.ArrayUtils .equals ( p1,v0,v1,v2,v3 );
	 /* if-nez v0, :cond_0 */
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
v0 = (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) p0 ).getFlags ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getFlags()I
/* and-int/lit16 v0, v0, 0xff */
org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat .fromID ( v0 );
this.mPVRTextureFormat = v0;
return;
} // .end method
/* # virtual methods */
public Integer getBitmaskAlpha ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x28 */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getBitmaskBlue ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x24 */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getBitmaskGreen ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x20 */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getBitmaskRed ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x1c */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getBitsPerPixel ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x18 */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getDataLength ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x14 */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getFlags ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x10 */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getHeight ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
int v1 = 4; // const/4 v1, 0x4
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getNumMipmaps ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0xc */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer getPVRTag ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x2c */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat getPVRTextureFormat ( ) {
/* .locals 1 */
v0 = this.mPVRTextureFormat;
} // .end method
public Integer getWidth ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x8 */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Boolean hasAlpha ( ) {
/* .locals 1 */
v0 = (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) p0 ).getBitmaskAlpha ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getBitmaskAlpha()I
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer headerLength ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
int v1 = 0; // const/4 v1, 0x0
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
public Integer numSurfs ( ) {
/* .locals 2 */
v0 = this.mDataByteBuffer;
/* const/16 v1, 0x30 */
v0 = (( java.nio.ByteBuffer ) v0 ).getInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I
} // .end method
