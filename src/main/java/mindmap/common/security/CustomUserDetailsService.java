package mindmap.common.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import mindmap.common.security.domain.CustomUser;
import mindmap.domain.Member;
import mindmap.mapper.MemberMapper;

public class CustomUserDetailsService implements UserDetailsService {

	private static final Logger Log = LoggerFactory.getLogger(CustomAccessDeniedHanlder.class);
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Log.warn("Load User By UserName : " + username);
		
		Member member = memberMapper.readByUserId(username);
		
		Log.warn("queried by member mapper : " + member);
		
		return member == null ? null : new CustomUser(member);
	}

}