public class org.anddev.andengine.opengl.font.FontFactory {
	 /* # static fields */
	 private static java.lang.String sAssetBasePath;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.font.FontFactory ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.font.FontFactory ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.font.Font create ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.graphics.Typeface p1, Float p2, Boolean p3, Integer p4 ) {
		 /* .locals 6 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/font/Font; */
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/font/Font;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Landroid/graphics/Typeface;FZI)V */
	 } // .end method
	 public static org.anddev.andengine.opengl.font.Font createFromAsset ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.content.Context p1, java.lang.String p2, Float p3, Boolean p4, Integer p5 ) {
		 /* .locals 6 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/font/Font; */
		 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 v3 = org.anddev.andengine.opengl.font.FontFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v3 );
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.graphics.Typeface .createFromAsset ( v1,v2 );
		 /* move-object v1, p0 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/font/Font;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Landroid/graphics/Typeface;FZI)V */
	 } // .end method
	 public static org.anddev.andengine.opengl.font.StrokeFont createStroke ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.graphics.Typeface p1, Float p2, Boolean p3, Integer p4, Float p5, Integer p6 ) {
		 /* .locals 8 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/font/StrokeFont; */
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* move v7, p6 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/opengl/font/StrokeFont;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Landroid/graphics/Typeface;FZIFI)V */
	 } // .end method
	 public static org.anddev.andengine.opengl.font.StrokeFont createStroke ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.graphics.Typeface p1, Float p2, Boolean p3, Integer p4, Float p5, Integer p6, Boolean p7 ) {
		 /* .locals 9 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/font/StrokeFont; */
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* move v7, p6 */
		 /* move/from16 v8, p7 */
		 /* invoke-direct/range {v0 ..v8}, Lorg/anddev/andengine/opengl/font/StrokeFont;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Landroid/graphics/Typeface;FZIFIZ)V */
	 } // .end method
	 public static org.anddev.andengine.opengl.font.StrokeFont createStrokeFromAsset ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.content.Context p1, java.lang.String p2, Float p3, Boolean p4, Integer p5, Float p6, Integer p7 ) {
		 /* .locals 8 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/font/StrokeFont; */
		 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 v3 = org.anddev.andengine.opengl.font.FontFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v3 );
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.graphics.Typeface .createFromAsset ( v1,v2 );
		 /* move-object v1, p0 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move v6, p6 */
		 /* move v7, p7 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/opengl/font/StrokeFont;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Landroid/graphics/Typeface;FZIFI)V */
	 } // .end method
	 public static org.anddev.andengine.opengl.font.StrokeFont createStrokeFromAsset ( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas p0, android.content.Context p1, java.lang.String p2, Float p3, Boolean p4, Integer p5, Float p6, Integer p7, Boolean p8 ) {
		 /* .locals 9 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/font/StrokeFont; */
		 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 v2 = org.anddev.andengine.opengl.font.FontFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v2 );
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.graphics.Typeface .createFromAsset ( p1,p2 );
		 /* move-object v1, p0 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move v6, p6 */
		 /* move/from16 v7, p7 */
		 /* move/from16 v8, p8 */
		 /* invoke-direct/range {v0 ..v8}, Lorg/anddev/andengine/opengl/font/StrokeFont;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Landroid/graphics/Typeface;FZIFIZ)V */
	 } // .end method
	 public static void reset ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 org.anddev.andengine.opengl.font.FontFactory .setAssetBasePath ( v0 );
		 return;
	 } // .end method
	 public static void setAssetBasePath ( java.lang.String p0 ) {
		 /* .locals 2 */
		 final String v0 = "/"; // const-string v0, "/"
		 v0 = 		 (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_0 */
		 v0 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
	 return;
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "pAssetBasePath must end with \'/\' or be lenght zero."; // const-string v1, "pAssetBasePath must end with \'/\' or be lenght zero."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
