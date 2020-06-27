package mindmap.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mindmap.domain.Member;
import mindmap.domain.MemberAuth;

@Mapper
public interface MemberMapper {
	public void create(Member member) throws Exception;
	public void createAuth(MemberAuth memberAuth) throws Exception;
	public Member readByUserId(String userId);
	public List<Member> list() throws Exception;
	public Member read(String userId) throws Exception;
}
