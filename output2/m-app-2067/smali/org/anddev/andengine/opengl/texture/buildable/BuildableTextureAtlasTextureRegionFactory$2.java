class org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlasTextureRegionFactory$2 implements org.anddev.andengine.util.Callback {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.opengl.texture.region.TiledTextureRegion val$tiledTextureRegion; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlasTextureRegionFactory$2 ( ) {
		 /* .locals 0 */
		 this.val$tiledTextureRegion = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCallback ( java.lang.Object p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* check-cast p1, Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource; */
		 (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlasTextureRegionFactory$2 ) p0 ).onCallback ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlasTextureRegionFactory$2;->onCallback(Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;)V
		 return;
	 } // .end method
	 public void onCallback ( org.anddev.andengine.opengl.texture.source.ITextureAtlasSource p0 ) {
		 /* .locals 3 */
		 v2 = 		 v1 = 		 v0 = this.val$tiledTextureRegion;
		 (( org.anddev.andengine.opengl.texture.region.TiledTextureRegion ) v0 ).setTexturePosition ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion;->setTexturePosition(II)V
		 return;
	 } // .end method
