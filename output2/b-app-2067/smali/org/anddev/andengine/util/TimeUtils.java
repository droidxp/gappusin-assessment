public class org.anddev.andengine.util.TimeUtils implements org.anddev.andengine.util.constants.TimeConstants {
	 /* # interfaces */
	 /* # direct methods */
	 public org.anddev.andengine.util.TimeUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String formatSeconds ( Integer p0 ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 org.anddev.andengine.util.TimeUtils .formatSeconds ( p0,v0 );
	 } // .end method
	 public static java.lang.String formatSeconds ( Integer p0, java.lang.StringBuilder p1 ) {
		 /* .locals 2 */
		 /* div-int/lit8 v0, p0, 0x3c */
		 /* rem-int/lit8 v1, p0, 0x3c */
		 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 /* const/16 v0, 0x3a */
		 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 /* const/16 v0, 0xa */
		 /* if-ge v1, v0, :cond_0 */
		 /* const/16 v0, 0x30 */
		 (( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
	 } // :cond_0
	 (( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
