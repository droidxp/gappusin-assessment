public abstract class com.google.api.client.escape.UnicodeEscaper extends com.google.api.client.escape.Escaper {
	 /* .source "UnicodeEscaper.java" */
	 /* # static fields */
	 private static final Integer DEST_PAD;
	 /* # direct methods */
	 public com.google.api.client.escape.UnicodeEscaper ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0}, Lcom/google/api/client/escape/Escaper;-><init>()V */
		 return;
	 } // .end method
	 protected static Integer codePointAt ( java.lang.CharSequence p0, Integer p1, Integer p2 ) {
		 /* .locals 6 */
		 /* .param p0, "seq" # Ljava/lang/CharSequence; */
		 /* .param p1, "index" # I */
		 /* .param p2, "end" # I */
		 /* .prologue */
		 /* .line 239 */
		 /* if-ge p1, p2, :cond_5 */
		 /* .line 240 */
		 /* add-int/lit8 v2, p1, 0x1 */
	 } // .end local p1 # "index":I
	 v0 = 	 /* .local v2, "index":I */
	 /* .line 241 */
	 /* .local v0, "c1":C */
	 /* const v3, 0xd800 */
	 /* if-lt v0, v3, :cond_0 */
	 /* const v3, 0xdfff */
	 /* if-le v0, v3, :cond_1 */
	 /* .line 252 */
} // .end local v0 # "c1":C
} // :cond_0
} // :goto_0
/* .line 244 */
/* .restart local v0 # "c1":C */
} // :cond_1
/* const v3, 0xdbff */
/* if-gt v0, v3, :cond_4 */
/* .line 246 */
/* if-ne v2, p2, :cond_2 */
/* .line 247 */
/* neg-int v0, v0 */
/* .line 250 */
v1 = } // :cond_2
/* .line 251 */
/* .local v1, "c2":C */
v3 = java.lang.Character .isLowSurrogate ( v1 );
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 252 */
v0 = java.lang.Character .toCodePoint ( v0,v1 );
/* .line 254 */
} // :cond_3
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Expected low surrogate but got char \'"; // const-string v5, "Expected low surrogate but got char \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v5 = "\' with value "; // const-string v5, "\' with value "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v5 = " at index "; // const-string v5, " at index "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v3 */
/* .line 258 */
} // .end local v1 # "c2":C
} // :cond_4
/* new-instance v3, Ljava/lang/IllegalArgumentException; */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Unexpected low surrogate character \'"; // const-string v5, "Unexpected low surrogate character \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v5 = "\' with value "; // const-string v5, "\' with value "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v5 = " at index "; // const-string v5, " at index "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v5, v2, -0x1 */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v3 */
/* .line 263 */
} // .end local v0 # "c1":C
} // .end local v2 # "index":I
/* .restart local p1 # "index":I */
} // :cond_5
/* new-instance v3, Ljava/lang/IndexOutOfBoundsException; */
final String v4 = "Index exceeds specified range"; // const-string v4, "Index exceeds specified range"
/* invoke-direct {v3, v4}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v3 */
} // .end method
private static growBuffer ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p0, "dest" # [C */
/* .param p1, "index" # I */
/* .param p2, "size" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 272 */
/* new-array v0, p2, [C */
/* .line 273 */
/* .local v0, "copy":[C */
/* if-lez p1, :cond_0 */
/* .line 274 */
java.lang.System .arraycopy ( p0,v1,v0,v1,p1 );
/* .line 276 */
} // :cond_0
} // .end method
/* # virtual methods */
public abstract java.lang.String escape ( java.lang.String p0 ) {
} // .end method
protected abstract escape ( Integer p0 ) {
} // .end method
protected final java.lang.String escapeSlow ( java.lang.String p0, Integer p1 ) {
/* .locals 13 */
/* .param p1, "s" # Ljava/lang/String; */
/* .param p2, "index" # I */
/* .prologue */
/* .line 147 */
v5 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* .line 150 */
/* .local v5, "end":I */
com.google.api.client.escape.Platform .charBufferFromThreadLocal ( );
/* .line 151 */
/* .local v2, "dest":[C */
int v3 = 0; // const/4 v3, 0x0
/* .line 152 */
/* .local v3, "destIndex":I */
int v10 = 0; // const/4 v10, 0x0
/* .line 154 */
/* .local v10, "unescapedChunkStart":I */
} // :goto_0
/* if-ge p2, v5, :cond_6 */
/* .line 155 */
v1 = com.google.api.client.escape.UnicodeEscaper .codePointAt ( p1,p2,v5 );
/* .line 156 */
/* .local v1, "cp":I */
/* if-gez v1, :cond_0 */
/* .line 157 */
/* new-instance v11, Ljava/lang/IllegalArgumentException; */
final String v12 = "Trailing high surrogate at end of input"; // const-string v12, "Trailing high surrogate at end of input"
/* invoke-direct {v11, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 163 */
} // :cond_0
(( com.google.api.client.escape.UnicodeEscaper ) p0 ).escape ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/api/client/escape/UnicodeEscaper;->escape(I)[C
/* .line 164 */
/* .local v7, "escaped":[C */
v11 = java.lang.Character .isSupplementaryCodePoint ( v1 );
if ( v11 != null) { // if-eqz v11, :cond_5
int v11 = 2; // const/4 v11, 0x2
} // :goto_1
/* add-int v8, p2, v11 */
/* .line 165 */
/* .local v8, "nextIndex":I */
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 166 */
/* sub-int v0, p2, v10 */
/* .line 170 */
/* .local v0, "charsSkipped":I */
/* add-int v11, v3, v0 */
/* array-length v12, v7 */
/* add-int v9, v11, v12 */
/* .line 171 */
/* .local v9, "sizeNeeded":I */
/* array-length v11, v2 */
/* if-ge v11, v9, :cond_1 */
/* .line 172 */
/* sub-int v11, v5, p2 */
/* add-int/2addr v11, v9 */
/* add-int/lit8 v4, v11, 0x20 */
/* .line 173 */
/* .local v4, "destLength":I */
com.google.api.client.escape.UnicodeEscaper .growBuffer ( v2,v3,v4 );
/* .line 176 */
} // .end local v4 # "destLength":I
} // :cond_1
/* if-lez v0, :cond_2 */
/* .line 177 */
(( java.lang.String ) p1 ).getChars ( v10, p2, v2, v3 ); // invoke-virtual {p1, v10, p2, v2, v3}, Ljava/lang/String;->getChars(II[CI)V
/* .line 178 */
/* add-int/2addr v3, v0 */
/* .line 180 */
} // :cond_2
/* array-length v11, v7 */
/* if-lez v11, :cond_3 */
/* .line 181 */
int v11 = 0; // const/4 v11, 0x0
/* array-length v12, v7 */
java.lang.System .arraycopy ( v7,v11,v2,v3,v12 );
/* .line 182 */
/* array-length v11, v7 */
/* add-int/2addr v3, v11 */
/* .line 185 */
} // :cond_3
/* move v10, v8 */
/* .line 187 */
} // .end local v0 # "charsSkipped":I
} // .end local v9 # "sizeNeeded":I
} // :cond_4
p2 = (( com.google.api.client.escape.UnicodeEscaper ) p0 ).nextEscapeIndex ( p1, v8, v5 ); // invoke-virtual {p0, p1, v8, v5}, Lcom/google/api/client/escape/UnicodeEscaper;->nextEscapeIndex(Ljava/lang/CharSequence;II)I
/* .line 188 */
/* .line 164 */
} // .end local v8 # "nextIndex":I
} // :cond_5
int v11 = 1; // const/4 v11, 0x1
/* .line 192 */
} // .end local v1 # "cp":I
} // .end local v7 # "escaped":[C
} // :cond_6
/* sub-int v0, v5, v10 */
/* .line 193 */
/* .restart local v0 # "charsSkipped":I */
/* if-lez v0, :cond_8 */
/* .line 194 */
/* add-int v6, v3, v0 */
/* .line 195 */
/* .local v6, "endIndex":I */
/* array-length v11, v2 */
/* if-ge v11, v6, :cond_7 */
/* .line 196 */
com.google.api.client.escape.UnicodeEscaper .growBuffer ( v2,v3,v6 );
/* .line 198 */
} // :cond_7
(( java.lang.String ) p1 ).getChars ( v10, v5, v2, v3 ); // invoke-virtual {p1, v10, v5, v2, v3}, Ljava/lang/String;->getChars(II[CI)V
/* .line 199 */
/* move v3, v6 */
/* .line 201 */
} // .end local v6 # "endIndex":I
} // :cond_8
/* new-instance v11, Ljava/lang/String; */
int v12 = 0; // const/4 v12, 0x0
/* invoke-direct {v11, v2, v12, v3}, Ljava/lang/String;-><init>([CII)V */
} // .end method
protected abstract Integer nextEscapeIndex ( java.lang.CharSequence p0, Integer p1, Integer p2 ) {
} // .end method
