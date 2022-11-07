public class com.ansca.corona.Ticks implements java.lang.Comparable {
	 /* .source "Ticks.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private Long fMilliseconds;
	 /* # direct methods */
	 private com.ansca.corona.Ticks ( ) {
		 /* .locals 0 */
		 /* .param p1, "value" # J */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 36 */
		 /* iput-wide p1, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
		 /* .line 37 */
		 return;
	 } // .end method
	 public com.ansca.corona.Ticks ( ) {
		 /* .locals 2 */
		 /* .param p1, "value" # Lcom/ansca/corona/Ticks; */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 24 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 25 */
			 /* iget-wide v0, p1, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
			 /* iput-wide v0, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
			 /* .line 27 */
		 } // :cond_0
		 return;
	 } // .end method
	 public static com.ansca.corona.Ticks fromCurrentTime ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 217 */
		 /* new-instance v0, Lcom/ansca/corona/Ticks; */
		 android.os.SystemClock .elapsedRealtime ( );
		 /* move-result-wide v1 */
		 /* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/Ticks;-><init>(J)V */
	 } // .end method
	 public static com.ansca.corona.Ticks fromLong ( Long p0 ) {
		 /* .locals 1 */
		 /* .param p0, "value" # J */
		 /* .prologue */
		 /* .line 209 */
		 /* new-instance v0, Lcom/ansca/corona/Ticks; */
		 /* invoke-direct {v0, p0, p1}, Lcom/ansca/corona/Ticks;-><init>(J)V */
	 } // .end method
	 /* # virtual methods */
	 public com.ansca.corona.Ticks add ( com.ansca.corona.TimeSpan p0 ) {
		 /* .locals 5 */
		 /* .param p1, "value" # Lcom/ansca/corona/TimeSpan; */
		 /* .prologue */
		 /* .line 47 */
		 /* if-nez p1, :cond_0 */
		 /* .line 50 */
	 } // .end local p0 # "this":Lcom/ansca/corona/Ticks;
} // :goto_0
/* .restart local p0 # "this":Lcom/ansca/corona/Ticks; */
} // :cond_0
/* new-instance v0, Lcom/ansca/corona/Ticks; */
/* iget-wide v1, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
(( com.ansca.corona.TimeSpan ) p1 ).getTotalMilliseconds ( ); // invoke-virtual {p1}, Lcom/ansca/corona/TimeSpan;->getTotalMilliseconds()J
/* move-result-wide v3 */
/* add-long/2addr v1, v3 */
/* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/Ticks;-><init>(J)V */
/* move-object p0, v0 */
} // .end method
public com.ansca.corona.Ticks addMilliseconds ( Long p0 ) {
/* .locals 3 */
/* .param p1, "value" # J */
/* .prologue */
/* .line 61 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, p1, v0 */
/* if-nez v0, :cond_0 */
/* .line 64 */
} // .end local p0 # "this":Lcom/ansca/corona/Ticks;
} // :goto_0
/* .restart local p0 # "this":Lcom/ansca/corona/Ticks; */
} // :cond_0
/* new-instance v0, Lcom/ansca/corona/Ticks; */
/* iget-wide v1, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* add-long/2addr v1, p1 */
/* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/Ticks;-><init>(J)V */
/* move-object p0, v0 */
} // .end method
public com.ansca.corona.Ticks addSeconds ( Long p0 ) {
/* .locals 5 */
/* .param p1, "value" # J */
/* .prologue */
/* .line 75 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, p1, v0 */
/* if-nez v0, :cond_0 */
/* .line 78 */
} // .end local p0 # "this":Lcom/ansca/corona/Ticks;
} // :goto_0
/* .restart local p0 # "this":Lcom/ansca/corona/Ticks; */
} // :cond_0
/* new-instance v0, Lcom/ansca/corona/Ticks; */
/* iget-wide v1, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* const-wide/16 v3, 0x3e8 */
/* mul-long/2addr v3, p1 */
/* add-long/2addr v1, v3 */
/* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/Ticks;-><init>(J)V */
/* move-object p0, v0 */
} // .end method
public Integer compareTo ( com.ansca.corona.Ticks p0 ) {
/* .locals 9 */
/* .param p1, "value" # Lcom/ansca/corona/Ticks; */
/* .prologue */
/* const-wide/16 v7, 0x0 */
int v4 = 1; // const/4 v4, 0x1
/* .line 136 */
/* if-nez p1, :cond_1 */
/* .line 156 */
} // :cond_0
} // :goto_0
/* .line 141 */
} // :cond_1
/* iget-wide v0, p1, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* .line 144 */
/* .local v0, "milliseconds":J */
/* const-wide/high16 v5, -0x8000000000000000L */
/* cmp-long v5, v0, v5 */
/* if-nez v5, :cond_2 */
/* .line 145 */
/* const-wide/16 v5, 0x1 */
/* add-long/2addr v0, v5 */
/* .line 149 */
} // :cond_2
/* iget-wide v5, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* sub-long v2, v5, v0 */
/* .line 150 */
/* .local v2, "result":J */
/* cmp-long v5, v2, v7 */
/* if-gez v5, :cond_3 */
/* .line 151 */
int v4 = -1; // const/4 v4, -0x1
/* .line 153 */
} // :cond_3
/* cmp-long v5, v2, v7 */
/* if-nez v5, :cond_0 */
/* .line 154 */
int v4 = 0; // const/4 v4, 0x0
} // .end method
public Integer compareTo ( java.lang.Object p0 ) {
/* .locals 1 */
/* .param p1, "value" # Ljava/lang/Object; */
/* .prologue */
/* .line 169 */
/* instance-of v0, p1, Lcom/ansca/corona/Ticks; */
/* if-nez v0, :cond_0 */
/* .line 170 */
int v0 = 1; // const/4 v0, 0x1
/* .line 174 */
} // .end local p1 # "value":Ljava/lang/Object;
} // :goto_0
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_0
/* check-cast p1, Lcom/ansca/corona/Ticks; */
} // .end local p1 # "value":Ljava/lang/Object;
v0 = (( com.ansca.corona.Ticks ) p0 ).compareTo ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/Ticks;->compareTo(Lcom/ansca/corona/Ticks;)I
} // .end method
public Boolean equals ( com.ansca.corona.Ticks p0 ) {
/* .locals 5 */
/* .param p1, "value" # Lcom/ansca/corona/Ticks; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 107 */
/* if-nez p1, :cond_1 */
/* .line 110 */
} // :cond_0
} // :goto_0
} // :cond_1
/* iget-wide v1, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* iget-wide v3, p1, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* cmp-long v1, v1, v3 */
/* if-nez v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .param p1, "value" # Ljava/lang/Object; */
/* .prologue */
/* .line 121 */
/* instance-of v0, p1, Lcom/ansca/corona/Ticks; */
/* if-nez v0, :cond_0 */
/* .line 122 */
int v0 = 0; // const/4 v0, 0x0
/* .line 124 */
} // .end local p1 # "value":Ljava/lang/Object;
} // :goto_0
/* .restart local p1 # "value":Ljava/lang/Object; */
} // :cond_0
/* check-cast p1, Lcom/ansca/corona/Ticks; */
} // .end local p1 # "value":Ljava/lang/Object;
v0 = (( com.ansca.corona.Ticks ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/Ticks;->equals(Lcom/ansca/corona/Ticks;)Z
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .prologue */
/* .line 183 */
/* iget-wide v0, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* long-to-int v0, v0 */
} // .end method
public com.ansca.corona.TimeSpan subtract ( com.ansca.corona.Ticks p0 ) {
/* .locals 4 */
/* .param p1, "value" # Lcom/ansca/corona/Ticks; */
/* .prologue */
/* .line 87 */
/* const-wide/16 v0, 0x0 */
/* .line 88 */
/* .local v0, "milliseconds":J */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 89 */
/* iget-wide v0, p1, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* .line 93 */
} // :cond_0
/* const-wide/high16 v2, -0x8000000000000000L */
/* cmp-long v2, v0, v2 */
/* if-nez v2, :cond_1 */
/* .line 94 */
/* const-wide/16 v2, 0x1 */
/* add-long/2addr v0, v2 */
/* .line 98 */
} // :cond_1
/* iget-wide v2, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* sub-long/2addr v2, v0 */
com.ansca.corona.TimeSpan .fromMilliseconds ( v2,v3 );
} // .end method
public Long toLong ( ) {
/* .locals 2 */
/* .prologue */
/* .line 200 */
/* iget-wide v0, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
/* return-wide v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 192 */
/* iget-wide v0, p0, Lcom/ansca/corona/Ticks;->fMilliseconds:J */
java.lang.Long .toString ( v0,v1 );
} // .end method
