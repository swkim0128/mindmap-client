package mindmap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mindmap.domain.Member;
import mindmap.domain.MemberAuth;
import mindmap.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public void register(Member member) throws Exception {
		// TODO Auto-generated method stub
		mapper.create(member);
		member = mapper.read(member.getUserId());
		
		MemberAuth memberAuth = new MemberAuth();
		memberAuth.setUserNo(member.getUserNo());
		memberAuth.setAuth("ROLE_USER");
		
		mapper.createAuth(memberAuth);
	}

	@Override
	public List<Member> list() throws Exception {
		// TODO Auto-generated method stub
		return mapper.list();
	}
	
	@Override
	public Member read(String userId) throws Exception {
		// TODO Auto-generated method stub
		return mapper.read(userId);
	}
}
