public class inal extends java.lang.Enum {
	 /* # static fields */
	 public static final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat AI_88;
	 public static final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat A_8;
	 private static final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat ENUM$VALUES; //synthetic
	 public static final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat I_8;
	 public static final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat RGBA_4444;
	 public static final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat RGBA_5551;
	 public static final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat RGBA_8888;
	 public static final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat RGB_565;
	 /* # instance fields */
	 private final Boolean mCompressed;
	 private final Integer mID;
	 private final org.anddev.andengine.opengl.texture.Texture$PixelFormat mPixelFormat;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 13 */
		 int v12 = 4; // const/4 v12, 0x4
		 int v11 = 3; // const/4 v11, 0x3
		 int v10 = 2; // const/4 v10, 0x2
		 int v9 = 1; // const/4 v9, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
		 final String v1 = "RGBA_4444"; // const-string v1, "RGBA_4444"
		 /* const/16 v3, 0x10 */
		 v5 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_4444;
		 /* move v4, v2 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;-><init>(Ljava/lang/String;IIZLorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v3, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
		 final String v4 = "RGBA_5551"; // const-string v4, "RGBA_5551"
		 /* const/16 v6, 0x11 */
		 v8 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_5551;
		 /* move v5, v9 */
		 /* move v7, v2 */
		 /* invoke-direct/range {v3 ..v8}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;-><init>(Ljava/lang/String;IIZLorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v3, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
		 final String v4 = "RGBA_8888"; // const-string v4, "RGBA_8888"
		 /* const/16 v6, 0x12 */
		 v8 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_8888;
		 /* move v5, v10 */
		 /* move v7, v2 */
		 /* invoke-direct/range {v3 ..v8}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;-><init>(Ljava/lang/String;IIZLorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v3, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
		 final String v4 = "RGB_565"; // const-string v4, "RGB_565"
		 /* const/16 v6, 0x13 */
		 v8 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGB_565;
		 /* move v5, v11 */
		 /* move v7, v2 */
		 /* invoke-direct/range {v3 ..v8}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;-><init>(Ljava/lang/String;IIZLorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v3, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
		 final String v4 = "I_8"; // const-string v4, "I_8"
		 /* const/16 v6, 0x16 */
		 v8 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.I_8;
		 /* move v5, v12 */
		 /* move v7, v2 */
		 /* invoke-direct/range {v3 ..v8}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;-><init>(Ljava/lang/String;IIZLorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v3, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
		 final String v4 = "AI_88"; // const-string v4, "AI_88"
		 int v5 = 5; // const/4 v5, 0x5
		 /* const/16 v6, 0x17 */
		 v8 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.AI_8;
		 /* move v7, v2 */
		 /* invoke-direct/range {v3 ..v8}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;-><init>(Ljava/lang/String;IIZLorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v3, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
		 final String v4 = "A_8"; // const-string v4, "A_8"
		 int v5 = 6; // const/4 v5, 0x6
		 /* const/16 v6, 0x1b */
		 v8 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.A_8;
		 /* move v7, v2 */
		 /* invoke-direct/range {v3 ..v8}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;-><init>(Ljava/lang/String;IIZLorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 int v0 = 7; // const/4 v0, 0x7
		 /* new-array v0, v0, [Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
		 v1 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat.RGBA_4444;
		 /* aput-object v1, v0, v2 */
		 v1 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat.RGBA_5551;
		 /* aput-object v1, v0, v9 */
		 v1 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat.RGBA_8888;
		 /* aput-object v1, v0, v10 */
		 v1 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat.RGB_565;
		 /* aput-object v1, v0, v11 */
		 v1 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat.I_8;
		 /* aput-object v1, v0, v12 */
		 int v1 = 5; // const/4 v1, 0x5
		 v2 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat.AI_88;
		 /* aput-object v2, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 v2 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat.A_8;
		 /* aput-object v2, v0, v1 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->mID:I */
		 /* iput-boolean p4, p0, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->mCompressed:Z */
		 this.mPixelFormat = p5;
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat fromID ( Integer p0 ) {
		 /* .locals 5 */
		 org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat .values ( );
		 /* array-length v1, v0 */
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* if-lt v2, v1, :cond_0 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Unexpected "; // const-string v2, "Unexpected "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* const-class v2, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
	 (( java.lang.Class ) v2 ).getSimpleName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "-ID: \'"; // const-string v2, "-ID: \'"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = "\'"; // const-string v2, "\'"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
/* aget-object v3, v0, v2 */
/* iget v4, v3, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->mID:I */
/* if-ne v4, p0, :cond_1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public static org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* const-class v0, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
} // .end method
public static org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat values ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat.ENUM$VALUES;
/* array-length v1, v0 */
/* new-array v2, v1, [Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
/* # virtual methods */
public final Integer getID ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->mID:I */
} // .end method
public final org.anddev.andengine.opengl.texture.Texture$PixelFormat getPixelFormat ( ) {
/* .locals 1 */
v0 = this.mPixelFormat;
} // .end method
public final Boolean isCompressed ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->mCompressed:Z */
} // .end method
