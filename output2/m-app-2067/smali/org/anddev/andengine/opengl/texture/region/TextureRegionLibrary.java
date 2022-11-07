public class org.anddev.andengine.opengl.texture.region.TextureRegionLibrary extends org.anddev.andengine.util.Library {
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.region.TextureRegionLibrary ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/Library;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.TextureRegionLibrary ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/Library;-><init>(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object get ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.region.TextureRegionLibrary ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/region/TextureRegionLibrary;->get(I)Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.TextureRegion get ( Integer p0 ) {
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/util/Library;->get(I)Ljava/lang/Object; */
		 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/region/TextureRegion; */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.region.TiledTextureRegion getTiled ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.mItems;
		 (( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
		 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/region/TiledTextureRegion; */
	 } // .end method
