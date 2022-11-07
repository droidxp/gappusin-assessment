public class org.anddev.andengine.opengl.font.FontLibrary extends org.anddev.andengine.util.Library {
	 /* # direct methods */
	 public org.anddev.andengine.opengl.font.FontLibrary ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/Library;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.font.FontLibrary ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/util/Library;-><init>(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 void loadFonts ( org.anddev.andengine.opengl.font.FontManager p0 ) {
		 /* .locals 3 */
		 v0 = this.mItems;
		 v1 = 		 (( android.util.SparseArray ) v0 ).size ( ); // invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* sub-int/2addr v1, v2 */
	 } // :goto_0
	 /* if-gez v1, :cond_0 */
	 return;
} // :cond_0
(( android.util.SparseArray ) v0 ).valueAt ( v1 ); // invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/opengl/font/Font; */
if ( p0 != null) { // if-eqz p0, :cond_1
	 (( org.anddev.andengine.opengl.font.FontManager ) p1 ).loadFont ( p0 ); // invoke-virtual {p1, p0}, Lorg/anddev/andengine/opengl/font/FontManager;->loadFont(Lorg/anddev/andengine/opengl/font/Font;)V
} // :cond_1
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
