public class org.anddev.andengine.level.LevelParser extends org.xml.sax.helpers.DefaultHandler implements org.anddev.andengine.level.util.constants.LevelConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.level.LevelLoader$IEntityLoader mDefaultEntityLoader;
	 private final java.util.HashMap mEntityLoaders;
	 /* # direct methods */
	 public org.anddev.andengine.level.LevelParser ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
		 this.mDefaultEntityLoader = p1;
		 this.mEntityLoaders = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
		 /* .locals 3 */
		 v0 = this.mEntityLoaders;
		 (( java.util.HashMap ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Lorg/anddev/andengine/level/LevelLoader$IEntityLoader; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
		 return;
	 } // :cond_0
	 v0 = this.mDefaultEntityLoader;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.mDefaultEntityLoader;
	 } // :cond_1
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Unexpected tag: \'"; // const-string v2, "Unexpected tag: \'"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\'."; // const-string v2, "\'."
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
