public class org.anddev.andengine.entity.layer.tiled.tmx.TMXObjectGroup implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final Integer mHeight;
	 private final java.lang.String mName;
	 private final org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties mTMXObjectGroupProperties;
	 private final java.util.ArrayList mTMXObjects;
	 private final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXObjectGroup ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mTMXObjects = v0;
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;-><init>()V */
		 this.mTMXObjectGroupProperties = v0;
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "name"; // const-string v1, "name"
		 this.mName = v0;
		 final String v0 = "width"; // const-string v0, "width"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;->mWidth:I */
		 final String v0 = "height"; // const-string v0, "height"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;->mHeight:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 void addTMXObject ( org.anddev.andengine.entity.layer.tiled.tmx.TMXObject p0 ) {
		 /* .locals 1 */
		 v0 = this.mTMXObjects;
		 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public void addTMXObjectGroupProperty ( org.anddev.andengine.entity.layer.tiled.tmx.TMXObjectGroupProperty p0 ) {
		 /* .locals 1 */
		 v0 = this.mTMXObjectGroupProperties;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;->mHeight:I */
	 } // .end method
	 public java.lang.String getName ( ) {
		 /* .locals 1 */
		 v0 = this.mName;
	 } // .end method
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties getTMXObjectGroupProperties ( ) {
		 /* .locals 1 */
		 v0 = this.mTMXObjectGroupProperties;
	 } // .end method
	 public java.util.ArrayList getTMXObjects ( ) {
		 /* .locals 1 */
		 v0 = this.mTMXObjects;
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObjectGroup;->mWidth:I */
	 } // .end method
