public class org.anddev.andengine.entity.layer.tiled.tmx.TMXProperty implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final java.lang.String mName;
	 private final java.lang.String mValue;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperty ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "name"; // const-string v1, "name"
		 this.mName = v0;
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "value"; // const-string v1, "value"
		 this.mValue = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getName ( ) {
		 /* .locals 1 */
		 v0 = this.mName;
	 } // .end method
	 public java.lang.String getValue ( ) {
		 /* .locals 1 */
		 v0 = this.mValue;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 v1 = this.mName;
		 java.lang.String .valueOf ( v1 );
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v1 = "=\'"; // const-string v1, "=\'"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.mValue;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = "\'"; // const-string v1, "\'"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
