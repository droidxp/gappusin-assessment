public class org.apache.commons.codec.StringEncoderComparator implements java.util.Comparator {
	 /* .source "StringEncoderComparator.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private final org.apache.commons.codec.StringEncoder stringEncoder;
	 /* # direct methods */
	 public org.apache.commons.codec.StringEncoderComparator ( ) {
		 /* .locals 1 */
		 /* .annotation runtime Ljava/lang/Deprecated; */
	 } // .end annotation
	 /* .prologue */
	 /* .line 47 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 48 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.stringEncoder = v0;
	 /* .line 49 */
	 return;
} // .end method
public org.apache.commons.codec.StringEncoderComparator ( ) {
	 /* .locals 0 */
	 /* .param p1, "stringEncoder" # Lorg/apache/commons/codec/StringEncoder; */
	 /* .prologue */
	 /* .line 57 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 58 */
	 this.stringEncoder = p1;
	 /* .line 59 */
	 return;
} // .end method
/* # virtual methods */
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) {
	 /* .locals 5 */
	 /* .param p1, "o1" # Ljava/lang/Object; */
	 /* .param p2, "o2" # Ljava/lang/Object; */
	 /* .prologue */
	 /* .line 77 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 82 */
	 /* .local v0, "compareCode":I */
	 try { // :try_start_0
		 v4 = this.stringEncoder;
		 /* check-cast v2, Ljava/lang/Comparable; */
		 /* .line 83 */
		 /* .local v2, "s1":Ljava/lang/Comparable;, "Ljava/lang/Comparable<Ljava/lang/Comparable<*>;>;" */
		 v4 = this.stringEncoder;
		 /* check-cast v3, Ljava/lang/Comparable; */
		 /* .line 84 */
		 /* .local v3, "s2":Ljava/lang/Comparable;, "Ljava/lang/Comparable<*>;" */
		 /* :try_end_0 */
		 v0 = 		 /* .catch Lorg/apache/commons/codec/EncoderException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 88 */
	 } // .end local v2 # "s1":Ljava/lang/Comparable;, "Ljava/lang/Comparable<Ljava/lang/Comparable<*>;>;"
} // .end local v3 # "s2":Ljava/lang/Comparable;, "Ljava/lang/Comparable<*>;"
} // :goto_0
/* .line 85 */
/* :catch_0 */
/* move-exception v1 */
/* .line 86 */
/* .local v1, "ee":Lorg/apache/commons/codec/EncoderException; */
int v0 = 0; // const/4 v0, 0x0
} // .end method
