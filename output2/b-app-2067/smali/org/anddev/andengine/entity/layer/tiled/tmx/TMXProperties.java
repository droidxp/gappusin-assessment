public class org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties extends java.util.ArrayList implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean containsTMXProperty ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 v0 = 		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ) p0 ).size ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;->size()I
		 /* sub-int/2addr v0, v3 */
		 /* move v1, v0 */
	 } // :goto_0
	 /* if-gez v1, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // :cond_0
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperty; */
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperty ) v0 ).getName ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperty;->getName()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
(( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperty ) v0 ).getValue ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperty;->getValue()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* move v0, v3 */
} // :cond_1
/* add-int/lit8 v0, v1, -0x1 */
/* move v1, v0 */
} // .end method
