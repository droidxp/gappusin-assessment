class org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$1 implements java.util.Comparator {
	 /* # interfaces */
	 /* # direct methods */
	 org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$1 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* check-cast p1, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback; */
		 /* check-cast p2, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback; */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$1 ) p0 ).compare ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$1;->compare(Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;)I
	 } // .end method
	 public Integer compare ( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback p0, org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback p1 ) {
		 /* .locals 2 */
		 (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback ) p2 ).getTextureAtlasSource ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;->getTextureAtlasSource()Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;
		 v0 = 		 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource; */
		 (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback ) p1 ).getTextureAtlasSource ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;->getTextureAtlasSource()Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;
		 v1 = 		 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource; */
		 /* sub-int/2addr v0, v1 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback ) p2 ).getTextureAtlasSource ( ); // invoke-virtual {p2}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;->getTextureAtlasSource()Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;
	 v0 = 	 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource; */
	 (( org.anddev.andengine.opengl.texture.buildable.BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback ) p1 ).getTextureAtlasSource ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/buildable/BuildableTextureAtlas$TextureAtlasSourceWithWithLocationCallback;->getTextureAtlasSource()Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource;
	 v1 = 	 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/source/ITextureAtlasSource; */
	 /* sub-int/2addr v0, v1 */
} // .end method
