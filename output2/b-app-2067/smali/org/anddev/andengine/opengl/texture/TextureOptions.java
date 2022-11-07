public class org.anddev.andengine.opengl.texture.TextureOptions {
	 /* # static fields */
	 public static final org.anddev.andengine.opengl.texture.TextureOptions BILINEAR;
	 public static final org.anddev.andengine.opengl.texture.TextureOptions BILINEAR_PREMULTIPLYALPHA;
	 public static final org.anddev.andengine.opengl.texture.TextureOptions DEFAULT;
	 public static final org.anddev.andengine.opengl.texture.TextureOptions NEAREST;
	 public static final org.anddev.andengine.opengl.texture.TextureOptions NEAREST_PREMULTIPLYALPHA;
	 public static final org.anddev.andengine.opengl.texture.TextureOptions REPEATING_BILINEAR;
	 public static final org.anddev.andengine.opengl.texture.TextureOptions REPEATING_BILINEAR_PREMULTIPLYALPHA;
	 public static final org.anddev.andengine.opengl.texture.TextureOptions REPEATING_NEAREST;
	 public static final org.anddev.andengine.opengl.texture.TextureOptions REPEATING_NEAREST_PREMULTIPLYALPHA;
	 /* # instance fields */
	 public final Integer mMagFilter;
	 public final Integer mMinFilter;
	 public final Boolean mPreMultipyAlpha;
	 public final Integer mTextureEnvironment;
	 public final Float mWrapS;
	 public final Float mWrapT;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.texture.TextureOptions ( ) {
		 /* .locals 16 */
		 /* const v3, 0x812f */
		 /* const/16 v15, 0x2901 */
		 /* const/16 v7, 0x2601 */
		 /* const/16 v1, 0x2600 */
		 /* const/16 v5, 0x2100 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/TextureOptions; */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move v2, v1 */
		 /* move v4, v3 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/TextureOptions;-><init>(IIIIIZ)V */
		 /* new-instance v6, Lorg/anddev/andengine/opengl/texture/TextureOptions; */
		 int v12 = 0; // const/4 v12, 0x0
		 /* move v8, v7 */
		 /* move v9, v3 */
		 /* move v10, v3 */
		 /* move v11, v5 */
		 /* invoke-direct/range {v6 ..v12}, Lorg/anddev/andengine/opengl/texture/TextureOptions;-><init>(IIIIIZ)V */
		 /* new-instance v8, Lorg/anddev/andengine/opengl/texture/TextureOptions; */
		 int v14 = 0; // const/4 v14, 0x0
		 /* move v9, v1 */
		 /* move v10, v1 */
		 /* move v11, v15 */
		 /* move v12, v15 */
		 /* move v13, v5 */
		 /* invoke-direct/range {v8 ..v14}, Lorg/anddev/andengine/opengl/texture/TextureOptions;-><init>(IIIIIZ)V */
		 /* new-instance v6, Lorg/anddev/andengine/opengl/texture/TextureOptions; */
		 int v12 = 0; // const/4 v12, 0x0
		 /* move v8, v7 */
		 /* move v9, v15 */
		 /* move v10, v15 */
		 /* move v11, v5 */
		 /* invoke-direct/range {v6 ..v12}, Lorg/anddev/andengine/opengl/texture/TextureOptions;-><init>(IIIIIZ)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/TextureOptions; */
		 int v6 = 1; // const/4 v6, 0x1
		 /* move v2, v1 */
		 /* move v4, v3 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/TextureOptions;-><init>(IIIIIZ)V */
		 /* new-instance v6, Lorg/anddev/andengine/opengl/texture/TextureOptions; */
		 int v12 = 1; // const/4 v12, 0x1
		 /* move v8, v7 */
		 /* move v9, v3 */
		 /* move v10, v3 */
		 /* move v11, v5 */
		 /* invoke-direct/range {v6 ..v12}, Lorg/anddev/andengine/opengl/texture/TextureOptions;-><init>(IIIIIZ)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/TextureOptions; */
		 int v6 = 1; // const/4 v6, 0x1
		 /* move v2, v1 */
		 /* move v3, v15 */
		 /* move v4, v15 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/TextureOptions;-><init>(IIIIIZ)V */
		 /* new-instance v6, Lorg/anddev/andengine/opengl/texture/TextureOptions; */
		 int v12 = 1; // const/4 v12, 0x1
		 /* move v8, v7 */
		 /* move v9, v15 */
		 /* move v10, v15 */
		 /* move v11, v5 */
		 /* invoke-direct/range {v6 ..v12}, Lorg/anddev/andengine/opengl/texture/TextureOptions;-><init>(IIIIIZ)V */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.NEAREST_PREMULTIPLYALPHA;
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.TextureOptions ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mMinFilter:I */
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mMagFilter:I */
		 /* int-to-float v0, p3 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mWrapT:F */
		 /* int-to-float v0, p4 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mWrapS:F */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mTextureEnvironment:I */
		 /* iput-boolean p6, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mPreMultipyAlpha:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void apply ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 3 */
		 /* const/16 v2, 0xde1 */
		 /* const/16 v0, 0x2801 */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mMinFilter:I */
		 /* int-to-float v1, v1 */
		 /* const/16 v0, 0x2800 */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mMagFilter:I */
		 /* int-to-float v1, v1 */
		 /* const/16 v0, 0x2802 */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mWrapS:F */
		 /* const/16 v0, 0x2803 */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mWrapT:F */
		 /* const/16 v0, 0x2300 */
		 /* const/16 v1, 0x2200 */
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mTextureEnvironment:I */
		 /* int-to-float v2, v2 */
		 return;
	 } // .end method
